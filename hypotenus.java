import java.util.Scanner;

public class hypotenus {
    public static void main(String[] args) {
        
        
        double a;
        double b; 
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number a ");
        a = sc.nextDouble();
        System.out.print("enter the number b ");
        b = sc.nextDouble();
        

        result = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("hypotenus :"+ result);
sc.close();
        
    }
}
