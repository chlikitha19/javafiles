import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
     //get choice form the user 
     //get radom choice for  the computer
     //check win conditions
     //ask to paly again
     //goodbye message

     String userchoice;
     int computerscore=0;
     int userscore=0;
     boolean correct = false;
     int n ;
     
     System.out.print("enter the number of times you want to play the game ");
     n = sc.nextInt();
     sc.nextLine();
     String[] choices={"rock","paper","scissors"};
     for(int i =0;i<n;i++){

      
      System.out.print("enter the users choice ROCK PAPER SCISSORS: ");
     userchoice = sc.nextLine().toLowerCase();

     if((userchoice.equals("rock"))||(userchoice.equals("scissors"))||(userchoice.equals("paper")))
     {
      System.out.println("your choice :" +userchoice);
      correct = true;
     }
     else{
      
      System.out.println("invalid choice");
      System.out.print("enter the correct choice :");
      
      
      }

     int choice = rand.nextInt(choices.length);
     String computerchoice = choices[choice];
     System.out.println("computer choice : " +computerchoice);
//SO HERE IN JAVA WE CANNOT USE == WE SHOULD USE .equals METHOD ONLY BECAUSE == CHECKS WHEATHER THEY ARE SAME MEMORY OR NOT

     if ( (computerchoice.equals("rock") && userchoice.equals("paper")) ||
       (computerchoice.equals("paper") && userchoice.equals("scissors")) ||
       (computerchoice.equals("scissors") && userchoice.equals("rock"))){
        userscore++;
     }
     else if(userchoice.equals(computerchoice)){
      userscore=userscore+0;
      computerscore = computerscore+0;
     }
     else{
      computerscore++;
        
     }
    }

    System.out.println("---------------------------------------");

     System.out.printf("users score is %d \n" , userscore);
     System.out.printf("computer score is %d \n",computerscore);

    System.out.println("---------------------------------------");

     if (userscore > computerscore){
      System.out.println("USER WON THE GAME 😁😁");
    
     }
     else if (userscore == computerscore){
      System.out.println("GAME TIE 😊");
     }
     else{
      System.out.println("COMPUTER WON THE GAME 😒😒");
     }
     
     
     

     sc.close();


        
    }
    
}
