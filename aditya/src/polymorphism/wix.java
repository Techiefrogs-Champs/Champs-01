package polymorphism;//method overriding

 class fix{
   void  run() {
       System.out.println("it is running");
   }
   void fast(){
       System.out.println("it is fasting");
   }
}
class wix extends fix{
    void run(){
        System.out.println("he is runner");
    }
    void fast(){
        System.out.println("he is fast");
    }
    public static void main(String []args){
        wix obj =new wix();
        obj.run();
        obj.fast();
    }
}
