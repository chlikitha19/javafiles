public class employee extends person{
    int salary;
    employee(String first,String last,int salary){
        super(first,last);
        this.salary = salary;

    }
    void showsalary(){
        System.out.println(first+" "+ last+" salary is "+"₹"+salary);
    }
    }
    
