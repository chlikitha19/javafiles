public class students{
    String name;
    int roll_no;
    String Branch;
    static int ds;
    static int it;
    static int cse;
    static int aiml;
    static int ece;
    students(String name, int roll_no , String Branch){
        this.name = name;
        this.roll_no = roll_no;
        this.Branch = Branch;
        switch(Branch){
            case "ds" -> ds+=1;
            case "cse"-> cse+=1;
            case "it" -> it+=1;
            case "aiml"-> aiml+=1;
            case "ece" -> ece+=1;  }
    
}
   void show(){
    System.out.println("name"+name);
    System.out.println("rollno"+roll_no);
    System.out.println("branch"+Branch);
    
   }
   static void display(){
    System.out.println("total_ds:"+ds);
    System.out.println("total_cse:"+cse);
    System.out.println("total_it:"+it);
    System.out.println("total aiml:"+aiml);
    System.out.println("total_ece:"+ece);

   }
   public static void main(String args[]){
    students s1 = new students("likitha",0,"it");
    students s2 = new students("linyi",1,"it");

    students.display();

    
   }
}