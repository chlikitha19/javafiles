public class friend {
    String name;
    static int nooffriends;

    friend(String name){
        this.name = name;
        nooffriends++;
    }
    static void findingfriends(){
        System.out.println("they have "+ nooffriends+" friends");
    }
    
}
