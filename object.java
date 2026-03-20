

public class object {
    public static void main(String[] args) {
        //object = an entity that holds data (attributes)
        // and can perform actions(methods)
        //it is a reference data type
        

        CAR car = new CAR();   // creating an car object just like scanner random objects 
        /* 
        System.out.println(car.make);//object name and dot attribute name 
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isdriving);
         */
        System.out.println(car.isdriving);

        car.start();
        System.out.println(car.isdriving);
        car.stop();
        System.out.println(car.isdriving);

    }
    
}
