public class methodoverriding {
    public static void main(String[] args) {
        //method overridding= when a subclass provides its own 
        //implementation of a method that is already defined
        //allows for code reusability and give specific implementation
        DOG kitten = new DOG();
        CAT billy = new CAT();
        FISH rani= new FISH();
        kitten.move();
        billy.move();
        rani.move(); //before writing overriding method fish rani is also running since fishes don't run we are chaning move method as swimming in fish class
//@Override method should have same method name
    }
    }
    class ANIMAL{
        void move(){
            System.out.println("this animal is running");
        }

    }
    class DOG extends ANIMAL{
        

    }
    class CAT extends ANIMAL{

    }
    class FISH extends ANIMAL{
        @Override
        void move(){
            System.out.println("this animal is swimming");
        }

    }
    

