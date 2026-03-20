import java.util.HashMap;

public class studenthashmap {
    String name;
    int roll_no;
    String Branch;

    static HashMap<String, Integer> count = new HashMap<>();

    studenthashmap(String name, int roll_no, String Branch){
        this.name = name;
        this.roll_no = roll_no;
        this.Branch = Branch;
        if (!count.ContainsKey(Branch)){
            count.put(Branch,1);

        } 
        else{
            int cnt = count.get(Branch)+1;
            count.put(Branch,cnt);


        }
        show();

    }
    void show(){
        System.out.println("\nRollno:"+roll_no+"\nName:"+name+"\nBranch:"+Branch);
        System.out.println("current branch count:");
        
    }
            
        }
   