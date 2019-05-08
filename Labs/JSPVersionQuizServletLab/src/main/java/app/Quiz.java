package app;

import java.util.ArrayList;

public class Quiz {
    int myScore = 0;
    int currentPos = 0;

    ArrayList<String> quesList= new ArrayList<String>(5);
    ArrayList<String> answerList= new ArrayList<String>(5);


        public Quiz()
        {

            quesList.add("3, 1, 4, 1, 5");
            quesList.add("1,1,2,3,5");
            quesList.add("1,4,9,16,25");
            quesList.add("2,3,5,7,11");
            quesList.add("1,2,4,8,16");

            answerList.add("9");
            answerList.add("8");
            answerList.add("36");
            answerList.add("13");
            answerList.add("32");
        }

    public boolean isCorrect(String answer){
        if(answer.trim().equals(answerList.get(currentPos)))
            return true;
        return false;
    }


    public String getHint(int currentPos){
        return answerList.get(currentPos);
    }

    public  int getNumQuestions(){
        return quesList.size();
    }

    public int getCurrentQuestionIndex(){
        return currentPos;
    }

    public int scoreAnswer(){
        currentPos++;
        return myScore++;
    }

    public int getNumCorrect(){
        return myScore;
    }

    public String getCurrentQuestion(){
        return quesList.get(currentPos);
    }


}
