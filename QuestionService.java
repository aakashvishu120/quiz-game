import java.util.Scanner;

public class QuestionService {
    //this is array if reerence not object
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        // questions[0] = new Question(1, "What", "Java", "Cpp", "Python", "Csharp", "java");
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(1, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(1, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(1, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(1, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz(){
        // System.out.println(questions[0].getQuestion());
        int i =0 ;
        for(Question q : questions){
            //System.out.println(q);  //this is due to toString method
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        System.out.println("user selected options are : ");
        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i =0 ; i < questions.length ; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : "+ score);
    }

}
