public class printfmain {
    public static void main(String[] args) {
        //printf ()= is a method used to format output
        //%[flags][width][.precision][specifier-character]
        String name = "likitha";
        char firstletter = 'L';
        int age = 19;
        System.out.printf("Hello %sn", name);
        System.out.printf("your name starts with letter %c\n",firstletter);
        /*so if we are using format specifiers then we should use %s for strings and %c for characters and 
        %d for integers and %f for double and %b for boolean
        %s %c %d %f %b are space holders so where you keep these space holders that were we print the format specifiers*/
       System.out.printf("your are %d age",age);
       // these will print in the same line unless you keep \n back slash n inside the quotes
    }

}
