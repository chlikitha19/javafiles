public class inheritance{//class organize is the grandparent class which children animal and plant
    //now the parent animal class has 2 children ----- are animal--parentclass; dog cat --subclasses 
    public static void main(String[] args) {
        //inheritance = one class inherits the attributes and methods from another class
        //child <- parent <- grandchild
        //

        dog Dog = new dog();
        cat Cat = new cat();
        Dog.eat();
        Cat.eat();
        System.out.println(Dog.lives);
        System.out.println(Cat.lives);
        Dog.speak();
        Cat.speak();
        System.out.println(Dog.isAlive);
        plant plants = new plant();
        System.out.println(plants.isAlive);
        plants.photosynthesis();
        //Dog.photosynthesis();   these leads to an error because dog is not related to plant dog cannot be inherited from the plant class 
        

    }//organize class is the superclass with two child classes plant and animal now these animal class acts as the superclass for the dog and cat sub classes
    
}//here plant class is inherited from the parent class organize which is not even related to the animal class 
