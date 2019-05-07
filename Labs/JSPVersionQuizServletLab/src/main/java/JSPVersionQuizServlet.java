import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import  java.lang.Throwable;

@WebServlet("/jspQuiz")

public class JSPVersionQuizServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Quiz sessQuiz = (Quiz) request.getSession().getAttribute("quiz");
        if (sessQuiz == null) {
            sessQuiz = new Quiz();
            request.getSession().setAttribute("quiz", sessQuiz);
        }

        String answer = request.getParameter("txtAnswer");

        if(request.getMethod().equals("POST")) {
            String isCheckAge = (String)request.getSession().getAttribute("isValidAge");

            if(isCheckAge==null||isCheckAge=="N") {
                try {
                    String playerAge = request.getParameter("txtAge");
                    int age = Integer.parseInt(playerAge);
                    if (!(age >= 4 && age <= 100))
                        throw new Exception("Invalid Age to play!");
                    request.getSession().setAttribute("isValidAge", "Y");
                } catch (Exception ex) {
                    request.getSession().setAttribute("isValidAge", "N");
                }
            }

        }
        RequestDispatcher dispatcher;





        boolean error = true;
        if ((answer != null) && sessQuiz.isCorrect(answer)) {
            error = false;
            sessQuiz.scoreAnswer();
        }

        request.setAttribute("error", error);
        request.setAttribute("answer", answer);

        if (sessQuiz.getCurrentQuestionIndex() <=5)
            dispatcher = request.getRequestDispatcher("quizpage.jsp");
        else
            dispatcher = request.getRequestDispatcher("quizoverpage.jsp");

        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}



