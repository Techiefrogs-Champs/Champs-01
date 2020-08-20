package interfaces;
   interface RegularPolygon{
       
          
   }
   class EquiletaralTriangle implements RegularPolygon{
    int s=3;
        int getNumsides(int a){
           return a;
       }
       EquiletaralTriangle(int side){
          s=side;
       }
        int getSideLength(){
           return s;
        }
      }
      class Square implements RegularPolygon{
        int s1=4;  
        int getNumsides(int b){
              return b;
          }
          Square(int side1){
              s1=side1;
           }
        int getSideLength(){
            return s1;
        }
    }
    class inter1{
        public  static void main(String []args) {
            EquiletaralTriangle obj1=new EquiletaralTriangle(3);
            Square obj2=new Square(4);
            System.out.println(obj1.getSideLength());
            System.out.println(obj1.getNumsides(5));
            System.out.println( obj2.getNumsides(4));
            System.out.println(obj2.getSideLength());
        }
    }