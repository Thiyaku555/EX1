
public class Pojomain {
    public static void main(String[] args) {

       // Pojomain r =new Pojomain();
       // List<> li =new ArrayList<>();
        PojoImp imp=new PojoImp();

        PojaClass ps =new PojaClass(1,"raja",20000, "chennai");
        PojaClass ps1 =new PojaClass(2,"raj",25000, "coimbator");
        PojaClass ps2 =new PojaClass(3,"ram",28000, "chennai");
        PojaClass ps3=new PojaClass(4,"rock",28000, "bangalor");
        PojaClass ps4 =new PojaClass(5,"rakul",27000, "coimbator");
        

        imp.addemp(ps);
        imp.addemp(ps1);
        imp.addemp(ps2);
        imp.addemp(ps3);
        imp.addemp(ps4);
       
       imp.deleteemp(ps4);

        System.out.println(imp.getallemp());
    


   



        
    }
    
}
