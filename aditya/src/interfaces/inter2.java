package interfaces;

 interface inter1  {
    
   
   public  void method1();
   public  void method2();
   public  void method3();  
    }
    class inter3 implements inter1{
        
    public void method1(){
            System.out.println("this is method1");
        }
    public void method2(){
        System.out.println("this is method2");
    }
   public  void method3(){
    System.out.println("this is method3");
   }
}
