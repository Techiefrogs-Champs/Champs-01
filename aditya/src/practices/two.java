package practices;
class Character{
    int a;
    char b;
 void method1(int a,char b){
        System.out.println("the answer is=" +a );
        System.out.println("the  second answer is=" +b);
       }
 void method1(char b, int a){
     System.out.println("the answer is=" +b);
     System.out.println("the sec answer is=" +a);
 }
}      
  class two{
      public static void main(String []args){
          Character obj1=new Character();
          obj1.method1(5,'s');
          obj1.method1('k',8);
      }
  }
