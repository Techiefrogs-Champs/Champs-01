package practices;

  class PrintNumber {
      int a;
      String name;
      char c;
      float j;
      double num;
      boolean b;
    
    void  printn(int a){
        System.out.println("the integer number is =" +a);
    
    }
    void printn(String name){
        System.out.println("the string name is=" +name);
    }
    void printn(char c ){
        System.out.println("the charecter is=" +c);
    }
    void printn(float j){
        System.out.println("the float value is=" +j);
    }
    void printn(double num){
        System.out.println("the double is=" +num);
    }
   void printn(boolean b){
        System.out.println("the boolean is=" +b);
    }
}



class Number{
   public static void main(String []args){
       PrintNumber obj=new PrintNumber();
       obj.printn(5);
       obj.printn("aditya"); 
       obj.printn('e');
       obj.printn(19.79f);
       obj.printn(-453678.8d);
       obj.printn(false);
        
      }
    } 
   
