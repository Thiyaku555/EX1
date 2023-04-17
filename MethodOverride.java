public class MethodOverride 
{
public int id =1;
public String name="abc";
public String city="chennai";

void display()
{
    System.out.println(id +" "+name);
}
}

/**
 * InnerMethodOverride
 */
class me extends MethodOverride {

    void display()
    {
        System.out.println(id +" "+name +" "+city);
    }

    
}

class Mainclass{
    public static void main(String[] args) {

        MethodOverride m1=new MethodOverride();
        me me1=new me();
        m1.display();
        me1.display();
        
    }
}
