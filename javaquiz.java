import java.util.Scanner;
public class javaquiz {
    public static void main(String[] args) {
        //java quiz game
        String[] question ={"what is the main function of a router?",
                            "which part of the computer is consider the brain?",
                            "what year was facebook launched?",
                            "who is know as the father of computer ?",
                            "what was the first programming language?"};
        String[][] options = {{"1.storing files","2.encrypting data","3.directing internet traffic","4.managing passwords"},
                             {"1.cpu","2.hard drive","3.ram","4.gpu"},
                             {"1.steve jobs ","2.bill gates","3.alan turing ","4.charles babage"},
                             {"1.cobal","2.c","3.fortran","4.assembly"},
                            {"1.2000","2.2004","3.2006","4.2008"}};
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("__________________________ ");
        for(int i = 0; i<question.length; i++){
            System.out.println(question[i]);
            for(String option :options[i]){
                System.out.println(option);
            }
            System.out.print("enter you guess: ");
            guess = sc.nextInt();
            if(guess == answers[i]){
                
                System.out.println("CORRECT");
                System.out.println();
                score ++;
            }
            else{
                
                System.out.println("WRONG!!");
                System.out.println();
            }
        }
        System.out.println("your final score is : " + score + "out of "+ question.length);

        //options array[][]
        //declare variables
        //welcome message
        //question
        //options 
        //get guess from user
        //check our guess
        //display final score
    }
    
}
