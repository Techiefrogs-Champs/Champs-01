package absracts;

abstract  class Marks {
    abstract int getPercentage(int a,int b,int c);
    abstract int getPercentage1(int w,int x,int y,int z);
class A1 extends Marks{ 
    int a;
    int b;
    int c;
    
    int getPercentage1(int w,int x,int y,int z){
      return 0;

    }
 // A1(int maths,int science,int english){
     
   //  a= maths;
     //b= science;
     //c= english;
     
    
    int  getPercentage(int a,int b,int c){
     return (a+b+c)/3;
   
  }
}
class B1 extends Marks{
    int w ;
    int x;
    int y;
    int z;
   int getPercentage(int a,int b,int c){
     return 0;

    }
 //B1(int maths,int science,int english,int social){
        
      //  w= maths;
      //  x= science;
      // y= english;
       //z= social;
       
    int getPercentage1(int w,int x,int y,int z){
      return (w+x+y+z)/4;
     
      }
    }
     class abs3{
        public static  void main(String[] args){
            Marks obj=new A1();
            Marks obj1=new B1();
           System.out.println(obj.getPercentage(60,70,90));
           System.out.println(obj1.getPercentage1(45,97,67,56));
        }
    }
  } 
