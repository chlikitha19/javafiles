public class arrayoop {
    public static void main(String[] args) {
        Bike bike1 = new Bike("KTM","red",139999,2023);
        Bike bike2 = new Bike("duke","black",175000,2023);
        Bike bike3 = new Bike("pulsar","red",75000,2019);
        Bike[] bikes ={bike1,bike2,bike3};
        for(int i = 0; i < bikes.length;i++){
            bikes[i].drive();

        

        }//this would print the same
        //we have to create the for loop with object name and nickname and the name where the objects present
        for(Bike bike:bikes){
            bike.drive();
        }
    }
    
}
