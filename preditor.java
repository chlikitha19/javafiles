public interface preditor {
    void hunt();

    
}
class lion implements preditor{
    @Override
    public void hunt(){
        System.out.println("the lion hunting");
    }
    

}
