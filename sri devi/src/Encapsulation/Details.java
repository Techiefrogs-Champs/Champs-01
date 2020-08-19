package Encapsulation;

 class Company {
       

private int empid;
   public void setEmpid(int eid ){ 

       empid=eid;
   }
public int getempid(){   

    return empid;
}
}
   public class Details{  
       public static void main(String[] args) {
            Company d=new Company();
            d.setEmpid( 2345);
            System.out.println( d.getempid());
      }
  

    }


