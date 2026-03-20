public class tostringmethod {   //vehiclecar class
    public static void main(String[] args) {
        //toString() = method inherited from the object class
        //used to return a string representation of an object
        //by default , it returns a hash code as a unique identifier 
        //it can be overridden to provide meaningful details
    vehiclecar  car = new vehiclecar("audi","ford",2025,"reddishblack");
    vehiclecar car2 = new vehiclecar("benz","mercedes",2024,"blackishhbrown");
    System.out.println(car);
    System.out.println(car2);
   

    }
    }
    

