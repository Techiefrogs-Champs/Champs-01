class EncapsulationDemo{
    private int sno;
    private String empName;
    private int empAge;

    public int getEmpSNO(){
        return sno;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setEmpSNO(int newValue){
        sno = newValue;
    }
}
public class Endemo{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("SRINIVAS");
         obj.setEmpAge(28);
         obj.setEmpSNO(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSNO());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
