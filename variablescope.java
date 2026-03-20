public class variablescope{
    static int x = 3;//CLASS VARIABLE



    public static void main(String[] args) {
        //variable scope = where a varaible can be accessed
    //local- inside of a method if we declare a variable it will be considered as local variable
    int x = 1;//LOCAL
    
    System.out.println(x);
    dosomething();


    }
     static void dosomething(){
       // int x = 2;//LOCAL
        System.out.println(x);

     }
}
// if there is no local varibles with name x then the jave it self sees if there is any x varaible present inside the class then it will print the class variable

