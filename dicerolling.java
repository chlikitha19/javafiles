import java.util.Random;
import java.util.Scanner;
public class dicerolling {
    public static void main(String[] args) {
        int total=0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("enter the number of times you are rolling a die: ");
        int numoftimes = sc.nextInt();
        for(int i = 1; i <=numoftimes;i++){
            int roll = rand.nextInt(1,7);
            printdie(roll);
            System.out.println("roll"+i+": " +roll); 
            total= total+roll;
            

        
        }
        System.out.println("total number :" +total);


        /*JAVA DICE ROLLING PROGRAM
        DECLARE VARIABLES
        CHECK IF NUMBER OF DICE >0
        ROLL ALL THE DICE
        GET THE TOTAL
        DISPLAY ASCII OF DICE
         */
        sc.close();
    }
    static void printdie(int roll){
        //we need a triple seted double quotes any thing between these 2 lines is the multiline strings
        //type windows+R and open charmap 
        String dice1 ="""
                --------
                |      |
                |   ▪  |
                |      |
                --------
                """;
        String dice2 ="""
                --------
                |      |
                | ▪  ▪ |
                |      |
                --------
                """;
        String dice3 ="""
                --------
                |  ▪   |
                |   ▪  |
                |    ▪ |
                --------
                """;
        String dice4 ="""
                --------
                | ▪  ▪ |
                |      |
                | ▪  ▪ |
                --------
                """;
        String dice5="""
                --------
                | ▪  ▪ |
                |   ▪  |
                | ▪  ▪ |
                --------
                """;
        String dice6 ="""
                --------
                | ▪  ▪ |
                | ▪  ▪ |
                | ▪  ▪ |
                --------
                """;
                switch(roll){
                    case 1 -> System.out.println(dice1);
                    case 2 -> System.out.println(dice2);
                    case 3 -> System.out.println(dice3);
                    case 4 -> System.out.println(dice4);
                    case 5 -> System.out.println(dice5);
                    case 6 -> System.out.println(dice6);
                    
                }
            

    }
}
