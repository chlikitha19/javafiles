public class Bike {
    String model;
    String color;
    double price;
    int year;
    Bike(String model,String color,double price, int year){
        this.model = model;
        this.color= color;
        this.price = price;
        this.year = year;

    

    }
    void drive(){
        System.out.println("you drive  the car "+this.model);
    }
    
    
}
