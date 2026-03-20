public class superkeyword {
    public static void main(String[] args) {
        //super = refers to the parent class (subclass <- superclass)
        //used in constructors and method overriding 
        //calls the parent construdctor to initialize attributes
        person persons = new person("tom","jerry");
        scholor schol= new scholor("ch","likitha",8.75);
        persons.showname();
        schol.showname();
        schol.showgpa();
        employee employe = new employee("riyan","sharam",100000);
        employe.showname();
        employe.showsalary();
    }
    
}
