import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet("/dictServlet")
public class dictServlet extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/entries?serverTimezone=UTC";


    static final String USER = "root";
    static final String PASS = ";Ov_?U+uA4lh";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("Hello servlet!");
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();


        String text = request.getParameter("word");

        Connection conn = null;
        Statement stmt = null;
        try {
            // register JDBC DRIVER
            Class.forName(JDBC_DRIVER);

            // create a Connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // run SQL search
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT wordtype, definition FROM entries WHERE word=\'" + text + "\'";
            ResultSet rs = stmt.executeQuery(sql);

            List result = new ArrayList();
            // run loop ResultData
            while (rs.next()) {
                // get the data
                String wordType = rs.getString("wordType");
                String definition = rs.getString("definition");

                // outprint data
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("wordType", wordType);
                map.put("definition", definition);
                result.add(map);
            }
            Gson gson = new Gson();
            out.print(gson.toJson(result));
            out.flush();
            out.close();

            // close
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // do the JDBC error
            se.printStackTrace();
            out.println(se);
        } catch (Exception e) {
            // do the Class.forName error
            e.printStackTrace();
            out.println(e);
        } finally {
            // close all of them
            try {
                if (stmt != null)
                    stmt.close();

            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

