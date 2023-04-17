 class Ex extends Thread {

    public void run()
    {
        //System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());

    }

    


    
}
 public class Exception1{
    public static void main(String[] args) {

       int n=5;
        
        for(int i=0;i<n;i++)
        {
            
            Ex ex1=new Ex();
          
            ex1.run();
            ex1.start();
       
        
        }


        
    }
 }