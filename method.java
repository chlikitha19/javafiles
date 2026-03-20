public class method {
   public static void main(String[] args) {
    //method = a block of reusable code that is executed when called()
    String name ="leena";
   int age = 25;
//methods are not familiar with the variables present in the other method
//so here we need arguments and set of parameters

    
    happybirthday(name,age);//anything you send in the method is know as argument

//when you given an arguments in method we need the set parameters as well
   } 
   static void happybirthday(String name,int age){

    System.out.println("Happy birthday to you ");
    System.out.println("Happy birthday to you ");
    System.out.println("Happy birthday to you ");
    System.out.printf("dear %s \n",name);
    System.out.printf("Happy birthday to you you are now %d \n",age);
    System.out.println("many greetings to you many greetings to you\n");
 

   }
}
