package encap;

public class Testing1 extends Testing {
    
    public static void main(String[] args) {
        Testing1 T = new Testing1();

        T.setName("PRIYA"); 
        T.setGender("FEMALE");
        T.setAge(21);

        System.out.println("NAME:"+T.getName()+"  GENDER: "+T.getGender()+"  AGE: "+T.getAge());
    }
}