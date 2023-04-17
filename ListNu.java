import java.util.ArrayList;
import java.util.List;

public class ListNu {
    public static void main(String[] args) {
        List<Integer> In1=new ArrayList<Integer>();
        List<Integer> In2=new ArrayList<Integer>();
        In1.add(2);
        In1.add(4);
        In1.add(5);
        In1.add(3);
        In1.add(10);

        for(int a:In1)
        {
            if(a%2==0)
            {
               In2.add(a);
            }
        }

System.out.println(In2);

        
    }
    
}
