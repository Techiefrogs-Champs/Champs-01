package inheritance;

class Counter{
    int i;
    void Increment(int i){
        System.out.println("i =" +i);
       
    }
}
        class Counter2 extends Counter{

       void method(int i){
       super.Increment(i);
      
    }
}
    class pro6{
        public static void main(String []args){
        Counter2 obj=new Counter2();
        obj.method(3);
    }
 }