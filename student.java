public class student {
    String name;
    int age ;
    int year ;
    double gpa;
    boolean isenrolled = true;
    student(String name , int age, int year,double gpa){
        this.name = name;
        this.age = age;
        this.year = year;
        this.gpa = gpa;
    

    }
    void study(){
        System.out.println(this.name +" is studying");
    }
    


    
}
