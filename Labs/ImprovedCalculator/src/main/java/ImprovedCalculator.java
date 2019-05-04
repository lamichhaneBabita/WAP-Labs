import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/impCalculate")
public class ImprovedCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String add_op1 = req.getParameter("add_op1");
            String add_op2 = req.getParameter("add_op2");
            double result = Double.parseDouble(add_op1)+Double.parseDouble(add_op2);

            String mul_op1 = req.getParameter("mul_op1");
            String mul_op2 = req.getParameter("mul_op2");
            double result1 = Double.parseDouble(mul_op1)* Double.parseDouble(mul_op2);

            req.setAttribute("add_op1", add_op1);
            req.setAttribute("add_op2", add_op2);
            req.setAttribute("result", result);

            req.setAttribute("mul_op1", mul_op1);
            req.setAttribute("mul_op2", mul_op2);
            req.setAttribute("result1", result1);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }
}
