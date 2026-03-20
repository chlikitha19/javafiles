import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        char operator;
        
        System.out.print("enter the number 1 : ");
        num1 = sc.nextInt();
        System.out.print("enter the number 2 : ");

        num2 = sc.nextInt();
        System.out.print("enter the number or the operator +,-,*,/,^ : ");
        operator = sc.next().charAt(0);

        switch(operator){
            case '+'-> System.out.println(num1+num2);
            case '-' -> System.out.println(num1-num2);
            case '*' -> System.out.println(num1*num2);
            case '/' -> {
                if(num2==0){
                    System.out.println("cannot divide by 0");
                }
                else{
                    System.out.println(num1/num2);
                }
            }
                        
            case '^' -> System.out.println(Math.pow(num1,num2));
            default -> {
                System.out.println("invalid operator!!");
                

            }


        }
        

        }




        
        
    }
    
