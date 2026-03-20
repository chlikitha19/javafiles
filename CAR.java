public class CAR {

    
        String make = "ford";
        int year = 2024;
        String model = "audi";
        double price = 399999;
        boolean isdriving = false;
        //these are all the attributes 
        void start(){
            isdriving = true;
            System.out.println("you start the engine");

        }
        void stop(){
            isdriving = false;
            System.out.println("you stopped the engine");
        }
    }  
    //here car is a class where these are is used as an object in other class

