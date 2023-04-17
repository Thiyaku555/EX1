public class Pojo {
    int a=10;
    String  b="abc";

    void c()
    {
       class inner{
        void d()
        {
            System.out.println("inner class"+ a +" "+b);
        }
    }

        inner innerobj =new inner();
        innerobj.d();
       

    }
}
    

