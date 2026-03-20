import java.util.Scanner;
public class scannerinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array;
        int sizeofarray;
        System.out.print("enter the size of the array:");
        sizeofarray = sc.nextInt();
        sc.nextLine();

        array = new String[sizeofarray];
        for(int i = 0;i<sizeofarray;i++){
            System.out.print("enter the array elements:");
            array[i]=sc.nextLine();
                }
        for(String arr : array){
            System.out.println(arr);
        }
    }
    
}
