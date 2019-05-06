import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class QuizServlet extends HttpServlet {


        private Quiz quiz = new Quiz();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            genQuizPage(quiz, resp.getWriter(),"3, 1, 4, 1, 5",false,"");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String answer =req.getParameter("txtAnswer");

            boolean isCorrect = quiz.isCorrect(answer);
            boolean error = false;
            if(isCorrect){
                quiz.scoreAnswer();
            }else{
                error=true;
            }
            if(quiz.getCurrentQuestionIndex()>=5){
//                PrintWriter out = resp.getWriter();
//                out.println("your current score is: ");
              genQuizOverPage( quiz,resp.getWriter());
            }else {
                genQuizPage(quiz, resp.getWriter(), quiz.getCurrentQuestion(), error, answer);
            }

        }

        private void genQuizPage(Quiz sessQuiz, PrintWriter out, String currQuest, boolean error, String answer) {

            out.print("<html>");
            out.print("<head>");
            out.print("	<title>NumberQuiz</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("	<form method='post'>");
            out.print("		<h3>Have fun with NumberQuiz!</h3>");
            out.print("<p>Your current score is: ");
            out.print(sessQuiz.getNumberCorrect() + "</br></br>");
            out.print("<p>Guess the next number in the sequence! ");
            out.print(currQuest + "</p>");

            out.print("<p>Your answer:<input type='text' name='txtAnswer' value='' /></p> ");

            /* if incorrect, then print out error message */
            if (error && (answer != null)) {  //REFACTOR?-- assumes answer null only when first open page
                out.print("<p style='color:red'>Your last answer was not correct! Please try again</p> ");
            }
            out.print("<p><input type='submit' name='btnNext' value='Next' /></p> ");

            out.print("</form>");
            out.print("</body></html>");
        }

        private void genQuizOverPage(Quiz sessQuiz, PrintWriter out ) {

            out.print("<html> ");
            out.print("<head >");
            out.print("<title>NumberQuiz is over</title> ");
            out.print("</head> ");
            out.print("<body> ");
            out.print("Your current Score is: "+ sessQuiz.getNumberCorrect() + "</br></br>");
            out.print("<p style='color:red'>The number quiz is over!</p></body> ");
            out.print("</html> ");
        }
}
