public class A1Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        A1 a1= new A1(10,"avd");
        A1 a2= new A1(10,"avd");
        A1 a3= new A1(10,"avd");
        A1 a4= new A1(10,"avd");

      System.out.println(a1);
        A1   b2[]=new A1[4];
        b2[0]=a1;
        b2[1]=a2;
        b2[2]=a3;
        b2[3]=a4;


        for(A1 str:b2)
       {
        System.out.println(str);
       }
    }

    
    
}
