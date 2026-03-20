public class Interface {
    public static void main(String[] args) {
        //interface = a blueprint for a class htat specifies a set of abstract methods 
        //           that implementing classes MUST define
        //           supports multiple inheritance like behaviour

        
        rabbit r1 = new rabbit();
        lion l1 = new lion();
        r1.flee();
        l1.hunt();
    }
    
}
