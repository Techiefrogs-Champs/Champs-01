package modifiers;

 class E {
    private int i=2;
     private void d(){
         System.out.println("my name is " +i);
     }
       } 
    public class B{
        public static void main(String []args){
        E obj=new E();
        obj.d();
      }
    
}