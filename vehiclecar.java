public class vehiclecar {
    String name;
    String model;
    int year;
    String color;
    vehiclecar(String name , String model,int year, String color)   {
        this.name = name;
        this.model = model;
        this.year= year;
        this.color = color;
    }
    @Override
    public String toString(){
        return  this.color +" "+ this.year +" "+this.model+" "+this.name;
        }
}
