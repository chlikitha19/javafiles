public class constructor {
    public static void main(String[] args) {
        //constructor = a special method ot initialize objects
        //you can pass arguments to a constructor
        //and set up intial values
        student student1 = new student("spongbob",19,2024,99.8); //this is the creation of constructor when we are creating the constructor we have to pass the every attribute that is present in the student class
        // each object should have there unique attributes when we are calling a construcor
        student student2 = new student("patric",20,2024,98.0);
        System.out.println(student1.name);
        System.out.println(student1.isenrolled);
        System.out.println(student2.name);//is that all students that we create all student object that all have a unique name because in the student class we only gave one name 
        //so all the students in that student class we'll have the same name that you gave 
        // now we 'll trye to do different names'
        System.out.println(student2.isenrolled);
        student1.study();

// we are going to pass some arguments in the paranthesis
//here student1's attributes are spongbob 19 2024 99.8
// student2's attributes are patric 20 2024 98.0
    }
    
}
