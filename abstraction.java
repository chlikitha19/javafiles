public class abstraction { //shape circle triangle rectangle
    public static void main(String[] args) {
        /*abstract = used to define abstract calsses and methods
        abstraction is the process of hiding implementation details 
        adn showing only the essentin featrues
        abstract classes CAN'T  be instantiated directly
        can contain 'abstract' methods (which must be implemented)
        can contain 'concrete' methods (which are inehrited)
        */
        circle Circle = new circle(3);
        triangle Triangle = new triangle(4,5);
        rectangle Rectangle = new rectangle(6,7);
        Circle.display();
        Triangle.display();
        Rectangle.display();
        System.out.println(Circle.area());
        System.out.println(Triangle.area());
        System.out.println(Rectangle.area());

        
    }
    
}
