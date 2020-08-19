abstract class Demo{

    abstract void method();
    abstract void method1();
    abstract void method2();
    
    public int ID = 24; 
    public String name = "PRIYA";
    public int age = 21;

    public void regularMethod(){
        System.out.println("THIS IS A REGULAR METHOD");
    }
}

 class abstractmethod extends Demo
{
   void method(){
       System.out.println("THIS IS ABSTRACT METHOD");
   }

   public static void main(String[] args) {
     Demo obj = new Demo();
     System.out.println(obj.ID+" "+obj.name);
     System.out.println(obj.ID+" "+obj.age+" "+obj.name);
obj.method();
   }
    
}





