package exceptionhandling;

class add {
   public  void display(int adb,int b){
       int c=adb+b;
     System.out.println(c);
   }
}
    class pro18{
        public static void main(String args[]){
        add obj=new add();
        obj.display(5,"thg");
        }
    }
