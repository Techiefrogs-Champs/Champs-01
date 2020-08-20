class Car{
   Car(){//default constructor
        System.out.println("it is default constructor" );
    
    }
}
 class Bike{
     int rate;
     String name;
     Bike(int rate , String name){//two parameterised constructor
         System.out.println("two parameterised constructor is  =" +rate  +name);
     }
 }
  class Lorry{
      int rate;
      String name;
      int age;
      Lorry(int rate , String name , int age){//three perameterized constructor
        System.out.println("three perameterized constructor is =" +rate +name +age);

      }
  }
    public class vechicles{
        public static void main(String []args){
        Car obj1=new Car();
        Bike obj2=new Bike(90000,"pulser");
        Lorry obj3=new Lorry(3000000,"mahindra", 2 );
        
      }
    } 