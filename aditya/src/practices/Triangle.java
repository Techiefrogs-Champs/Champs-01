package practices;



class Triangle {
   int a,b,c,h;
   int area;
   int perimeter;
   public Triangle(int a,int b,int c ,int h){
   

   }
   public double areas(int b,int h){
      return  area= (b*h)/2;
     
   }
   public int perimeters(int a,int b,int c){
     return perimeter=a+b+c;
      
   }
  
   public static void main(String []args){
      Triangle obj2=new Triangle(3,4,5,7);
      System.out.println(obj2.areas(4,7));
      System.out.println(obj2.perimeters(3,4,5));
    }
}

    
