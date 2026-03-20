public class breakContinue {
    public static void main(String[] args) {
        //break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)
        int n = 20;
        


        for(int i = 0; i<n;i++){
            
            if(i==13){
                break;
            }
            else{
                if(i==5){
                    continue;
                }
                    else{
                
                System.out.println(i);
            
                    }
                }


        }
    }
    
}
