public class Employe {
 int no,i;
 String name,address;
Employe(){

}
   

    public static void main(String[] args) {
        Employe obj1=new Employe();
        obj1.i=1;
        obj1.no=22;
        obj1.name="ramesh";
        obj1.address="hbiuh";
        System.out.println("employe salaruy ="+obj1.i);
        System.out.println("employe joining year ="+obj1.no);
        System.out.println("employe address ="+obj1.address);
        System.out.println("employe name ="+obj1.name);
        Employe obj2=new Employe();
       obj2.i=4;
       obj2.no=88;
       obj2.name="ravi";
       obj2.address="jdjddj";
       System.out.println("employe salaruy ="+obj2.i);
       System.out.println("employe joining year ="+obj2.no);
       System.out.println("employe address ="+obj2.address);
     System.out.println(obj2.name);   
      Employe obj3=new Employe();
      obj3.i=48;
      obj3.no=78;
      obj3.name="teja";
      obj3.address="jdjddj";
      System.out.println("employe salaruy ="+obj3.i);
      System.out.println("employe joining year ="+obj3.no);
      System.out.println("employe address ="+obj3.address);
     System.out.println(obj3.name);

    }

}