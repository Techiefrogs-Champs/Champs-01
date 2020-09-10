package accessing;

 class privates {
    private int a;
    private String name;
    void add(int a,String name ){
        System.out.println("the topic is =" +a +name);
   }
    public static void main(String []args){
    privates obj=new privates();
    obj.add(6,"aditya");
   }
 }