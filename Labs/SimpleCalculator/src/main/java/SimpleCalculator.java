import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate")
public class SimpleCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String add_op1 = req.getParameter("add_op1");
        String add_op2 = req.getParameter("add_op2");
        String mul_op1 = req.getParameter("mul_op1");
        String mul_op2 = req.getParameter("mul_op2");

        resp.getWriter().print("Reuslt of additon is :"+(Integer.parseInt(add_op1)+Integer.parseInt(add_op2))+"\n");
        resp.getWriter().print("Reuslt of multiplication is :"+(Integer.parseInt(mul_op1)*Integer.parseInt(mul_op2)));

    }


}
