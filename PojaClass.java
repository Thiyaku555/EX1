public class PojaClass {
 private int empId;
 private  String  empName;
 private int salary;
 private  String city;

  public PojaClass(){}


  
public PojaClass(int empId, String empName, int salary, String city) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.city = city;
}
public int getEmpId() {
    return empId;
}
public void setEmpId(int empId) {
    this.empId = empId;
}
public String getEmpName() {
    return empName;
}
public void setEmpName(String empName) {
    this.empName = empName;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
@Override
public String toString() {
    return "PojaClass [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", city=" + city + "]";
}


  
    
}
