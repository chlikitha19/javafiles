public class returnsquare {
    public static void main(String[] args) {
        double result = square(3);
        System.out.println(result);
        System.out.println(cube(3));
        System.out.println(num(53));
        
    }
    static double square(double number){
        return number*number;
    }
    static double cube(double number){
        return number*number*number;
    }
    static int num(int number){
        return number;
    }
}
