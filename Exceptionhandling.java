import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        try{



            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        int array1[]=new int[5];

            try {
                
                for(int i=0;i<array1.length;i++)
             array1[i]=sc.nextInt();
              System.out.println(array1);
            }
           catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
           }
        }
        catch(Exception E1)
        {
            System.out.println(E1);
        }
    }
}
        
        
     
    

