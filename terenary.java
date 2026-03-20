public class terenary {
    public static void main(String[] args) {
        //terenary operator ? = return 1 of 2 values if a condition is true 
        // variable = (condition ) ? iftrue : iffalse

        int score = 40;
        String passOrFail = (score>=60) ? "pass" : "fail"  ;
        System.out.println(passOrFail); 


        int number = 60;
        System.out.println((number%2 == 0) ? "EVEN" : "ODD");
    }
    
}
