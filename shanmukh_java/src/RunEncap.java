public class RunEncap {

    public static void main(String args[]) {
       EncapTest encap = new EncapTest();
       encap.setName("shanmukh");
       encap.setAge(23);
       encap.setPhno("950247170");
 
       System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge()+ "Ph no :"+ encap.getPhno());
    }
 }