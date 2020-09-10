package Encapsulation;

public class Car {

  private String company;
  private int speed;
  private String model;
  private int tyres;

     public String getCompany(){ 
      return company;
     } 

      public void setCompany(String company){ 

     this.company=company;
      }

      public int getSpeed(){ 
      return speed;
    
      }
      public void setSpeed(int speed){ 

        this.speed=speed;
      }

       public String getModel(){ 

         return model;
       }

     public void setModel( String model){ 

        this.model=model;
     }
     public int getTyres(){ 
         return tyres;
     }
     public void setTyres( int tyres){ 

        this.tyres=tyres;

     }
    public static void main(String[] args) {
        
     Car obj=new Car();
     obj.setCompany("honda");
     obj.setSpeed(100);
     obj.setTyres(4);
     obj.setModel("x");
     System.out.println("company name is"+" "+obj.getCompany());
     System.out.println("speed"+" "+obj.getSpeed());
     System.out.println("no.of tyres"+"  "+obj.getTyres());
     System.out.println("model is"+"  "+obj.getModel());

    }

}