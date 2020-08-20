package practices;

  class Rec {
    int length;
    int breadth;
    int area;
    Rec(int l,int b){
       length=l;
       breadth=b;
    }
     int returnArea(){
       return area=length*breadth;
    }
}
    class Area3{
        public static void main(String []args){
           Rec obj5=new Rec(5,6);
            System.out.println(obj5.returnArea());

        }
    }