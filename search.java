import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1,2,3,4,6,7,9,5,10};
        String[] fruits = {"apple","banana","guava","cherry"};
        String target ;
        boolean isfound = false;
        System.out.print("enter the target element : ");
        target = sc.nextLine();
        for(int i = 0; i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("element found at index : "+ i);
                isfound = true;
                break;


            }
           
           }
            if(!isfound){
            System.out.println("element doesn't exists");
        }
        sc.close();
    }
    
}
