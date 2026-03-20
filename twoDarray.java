public class twoDarray{
    public static void main(String[] args) {
        //2D array = an array where each element is an array
        // useful  for storying a matrix of data
        String[] fruits = {"apple","orange","banana"};
        String[] vegetables ={"potato","onion","carrot"};
        String[] meat ={"chicken","mutton","fish"};
        String[][] groceries = {fruits,vegetables,meat};
        groceries[0][2]  ="pineapple"; //where we can change or replace the names of the elements in the groceries in 2 dimensional
        System.out.println(groceries);
        for(String[] grocerie : groceries){
            for(String food : grocerie){
                System.out.print(food+" ");

            }
            System.out.println();

        }    }
    
}
