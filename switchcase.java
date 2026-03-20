import java.util.Scanner;
public class switchcase{
    public static void main(String args[]){
        // enhanced switch = a replacement to many else if statements ( java14 feature)
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch(day){                          // -> this is an arrow operator it means that if its true than do this 
            case "monday" -> System.out.println("it is a weekday");
            case "tuesday" -> System.out.println("it is a weekday");
            case "wednesday" -> System.out.println("it is a weekday");
            case "thrusday" -> System.out.println("it is a weekday");
            case "friday" -> System.out.println("it is a weekday");
            case "saturday" -> System.out.println("it is a weekend");

            case "sunday" -> System.out.println("it is a weekend");
            default -> System.out.println(day + " it is not  a day");
        }



    }
    
}
