public class user {
    String username;
    String email;
    int age;
    
    user(String username){
        this.username = username;
        this.email = "not provided";
        this.age  = 0;
    }
//we can create the methods with same name but we should create with the different parameters
    user(String username,String email){
        this.username = username;
        this.email = email;
        this.age  = 0;
    }
    user(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age  = 0;

    }

    
}
