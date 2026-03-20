import java.util.Scanner;
public class bankingprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*JAVA BANKING PROGRAM
    DECLARE VARIABLES
    DISPLAY MENU
    GET AND PROCESS USERS CHOICE 
    showBalance()
    deposite()
    withdraw()
    EXIT MESSAGE
     */
    double balance=0;
    boolean isRunning = true;
    int choice;

    while (isRunning){

    System.out.println("------------------");
    System.out.println("1.check balance");
    System.out.println("2.deposite");
    System.out.println("3.withdraw");
    System.out.println("4.EXIT");
    System.out.println("------------------");
    System.out.print("enter the choice (1-4): ");
    choice = sc.nextInt();
    switch(choice){
        case 1 -> { 
            System.out.println("SHOW BALANCE");
            showBalance(balance);
}
        case 2 ->{ 
            System.out.println("DEPOSITE");
            balance+=deposite(balance);
}
        case 3->{
          System.out.println("WITHDRAW");
          balance-=withdraw(balance);

}
        case 4 -> {
        System.out.println("EXIT");
        isRunning = false;
        }
        default -> System.out.println("invalid number");
    }
}

    

    sc.close();
    }
    static void showBalance(double balance){
        System.out.printf("$ %.2f\n",balance);
    }
    static double deposite(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount you wanna deposite: ");
        int amount = sc.nextInt();
        if (amount <=0){
            System.out.println("enter the valid amount");
            return 0;
        }
        else{
            return amount;
        }

        }
    
    static double withdraw(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amoutn to withdraw :");
        int amount = sc.nextInt();
        if (amount <=0){
            System.out.println("enter the valid amount");
            return 0;
        }
        else{
            return amount;
        }

        }
    }
