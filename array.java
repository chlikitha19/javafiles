import java.util.Arrays;
public class array {
    public static void main(String args[]){
        String[] fruits = {"apple","orange","banana","coconut"};
        
        System.out.println(fruits.length);
        System.out.println(fruits[1]);
        //Arrays.sort(fruits);
        Arrays.fill(fruits,"pineapple");
        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
    
}
