import java.util.Scanner;
public class slotmachine {
    public static void main(String[] args) {
        System.setProperty("file.encoding","UTF-8");
        
        Scanner sc = new Scanner(System.in);
        //java slot machine 
        //declare variables
        //play if balance >0
        //enter bet amount
        //VERIFY IF BET >BALANCE
        //VERIFY IF BET >0
        //PRINT ROW                       
        //SUBTRACT BET FROM BLANACE
        //SPIN ROW
        //GET PAYOUTB
        //ADK TO PLAY AGAIN
        //DISPLY EXIT MESSAGE

        int balance=10 ;
        int bet ;
        int payout;
        String[] row={"😁","😒","😪"};
        System.out.println("----------------------");
        System.out.println("JAVA SLOT MACHINE GAME");
        System.out.println("----------------------");
        for (String rows:row){
        System.out.println(row);
        }
        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        while(balance >0){
            System.out.println("current balance : ₹" + balance);
            System.out.print("enter the bet amount :₹");
            bet = sc.nextInt();
            if (bet >0){
                if(bet<balance){
                    balance -=bet;
                }
                else{
                    System.out.println("INSUFFICIENT BALANCE");
                }

            }
            else{
                System.out.println("bet should be greater than zero");
            }




        }
        
    }
    
}
