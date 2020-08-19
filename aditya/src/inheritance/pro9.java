package inheritance;

 class Apple {
     int num_of_items;
}
class Banana extends Apple{
    int num_of_items;
    Banana(int num_of_items){
       this.num_of_items=num_of_items;
    }
    public int show( ){
      return num_of_items;
    }
}
class pro9{
    public static void main(String []args){
        Banana obj=new Banana();
        System.out.println(obj.show());
        System.out.println(obj.show());
    }
}