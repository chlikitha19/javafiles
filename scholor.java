
public class scholor extends person{
    double gpa;
    scholor (String first, String last, double gpa){
        super(first,last);
       // this.first = first;
        //this.last = last; we cannot inherite the first and last by this we should use super keyword to take these parameters since it is inherited from the person class
        this.gpa = gpa;
    }

    void showgpa(){
        System.out.println(first+" "+last+" gpa is " + gpa);
    }
    
}
