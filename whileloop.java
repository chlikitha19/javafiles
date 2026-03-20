import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // whileloop= repeat some code forever 
        // while soem condition remains true
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("enter the name ");
        
        while(name.isEmpty()){
            System.out.println("you didn't enter the name !!!");
            System.out.print("enter the name ");
            name=sc.nextLine();
        }
        System.out.println("your name is " + name);

    }
    
}
