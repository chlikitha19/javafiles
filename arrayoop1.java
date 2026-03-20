public class arrayoop1 {
    public static void main(String[] args) {
        Bike[] bike = {new Bike("KTM","red",139999,2023),
                     new Bike("duke","black",175000,2023),
                    new Bike("pulsar","red",75000,2019)};
            for(Bike bikes : bike){
                bikes.drive();

            }
    }
    
}
