public class second {
    public static void main(String[] args){
        c1 obj=new c1();
        c2 obj1 =new c2();
        c3 obj2= new c3(23, "ram");
    }

}
class c1{
    c1(){
        System.out.println("defaul const");
    }
}
class c2{
    int i=98;
    String name="sha";
    c2()
    {
        
        System.out.println("id"+i+"name"+name);
    }
}
class c3{
    int a;
    String b;
  
    public c3(int age, String name) {
      a = age;
      b= name;
      System.out.println("age"+a+" "+"name"+b);
    }
  

    
}