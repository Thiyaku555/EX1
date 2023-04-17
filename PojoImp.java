import java.util.ArrayList;
import java.util.List;

public class PojoImp implements Pojoser{


    List<PojaClass> li=new ArrayList<>();
    

    @Override
    public List<PojaClass> getallemp() {
        return li;
           }

    @Override
    public PojaClass getemp(PojaClass pso) {
       return pso;
    }

    @Override
    public void addemp(PojaClass pso1) {
        li.add(pso1);
    }

    @Override
    public void updatemp(PojaClass pso3) {
        li.get(pso3.getEmpId()).setEmpName(pso3.getEmpName());
        
      
    }

    @Override
    public void deleteemp(PojaClass pso2) {
        li.remove(pso2);
       
    }
    
}
