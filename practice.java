public class practice {
    public String name;
    public void hello(String name){
        System.out.println("hellow" + name);
    }
    public static void main(String args[]){
        practice obj = new practice();
        obj.name ="likitha";
        System.out.println(obj.name);
        obj.hello("lahari");
        
}
    }
    
