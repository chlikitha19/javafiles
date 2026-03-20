public class Customer{
    String name;
    int amount;
    int id;
    static int grand_total;
    Customer(String name,int amount,int id){
        this.name = name;
        this.amount = amount;
        this.id = id;
        grand_total+=amount;

    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("amount:"+amount);
        System.out.println("id:"+id);
        System.out.println("Grand Total:"+grand_total);

    }
    public static void main(String args[]){
        Customer c1 = new Customer("Alice",500,101);
        Customer c2 = new Customer("Bob",300,102);
        Customer c3 = new Customer("Charlie",200,103);
        c1.show();
        c2.show();
        c3.show();
    }

}
