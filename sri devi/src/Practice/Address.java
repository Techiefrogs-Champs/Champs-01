package Practice;
   
   class particulars{ 

      int rollnum=987;
      int phn=456783920;
      String name="john";
      void num1(){ 
       System.out.println( "name of the candidate is"+name);

      }
      
      }


     class Candidate{ 
  int rollnum=456;
  int phn=908745678;
  String name="sam";
  void num2(){ 

  System.out.println("name of the candidate is "+name);
  System.out.println(" mobile number is" +phn);

  }
     }


public class Address {
    
    public static void main(String[] args) {
        
    Candidate c1=new Candidate(    ); 
    particulars p= new particulars();
    
    c1.num2();
    p.num1();
    
   

    }
}