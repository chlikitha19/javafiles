import java.util.Random;
import java.util.Scanner;
public class dowhilelooprandom {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------guessing number game--------");
        System.out.println("numbers should be in the range 1-12");



        int guess ;
        int randomnumber ;
        int attemps = 0;
        randomnumber = rand.nextInt(1,12);

        do { 
            
            System.out.print("enter the number :");
            guess = sc.nextInt();
            attemps++;


            
        } while (guess != randomnumber);
    
        
        
        
        System.out.println("computer guess :" + randomnumber);
        System.out.println(attemps + " you have taken ");


    }
    
}
