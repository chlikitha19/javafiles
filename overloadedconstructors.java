
public class overloadedconstructors {
    public static void main(String[] args) {
        //overloaded constructors = allw a class to have multiple constructors with different parameter lists 
        //enable objects to be intitialized in various ways
        user use1= new user("spongbob");
        user use2= new user("patric ","patric@gmail.com");
        user use3= new user("nilofor","nilofor@gmail.com",19);
        System.out.println(use1.username);
        System.out.println(use1.age);
        System.out.println(use1.email);
        System.out.println(use2.username);
        System.out.println(use2.age);
        System.out.println(use2.email);
        System.out.println(use3.username);
        System.out.println(use3.age);
        System.out.println(use3.email);


    }
    
}
