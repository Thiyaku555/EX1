import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ListAl {
    public static void main(String[] args) {
        
    
    List<String> lis=new ArrayList<String>();
   // List<String> lis1=new ArrayList<String>();
    lis.add("cherry");
    lis.add("banana");
    lis.add("apple");
    lis.add("apple");
    lis.add("banana");


  List<String> lis2=new ArrayList<>();

  for(String a: lis)
  {
    if(!lis2.contains(a))
    {
        lis2.add(a);
    }
   
  }
Collections.sort(lis);
System.out.println(lis);
  System.out.println(lis2);
Collections.reverse(lis2);
System.out.println(lis2);
lis2.sort(null);
System.out.println(lis2);






  }}

