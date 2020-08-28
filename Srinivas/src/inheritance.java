class Employee{  
    float salary=62400;  
   }  
   class inheritance extends Employee{  
    int bonus=10000;  
    public static void main(String args[]){  
      inheritance p=new inheritance();  
      System.out.println("employee salary is:"+p.salary);  
      System.out.println("Bonus of employee is:"+p.bonus);  
   }  
   }  