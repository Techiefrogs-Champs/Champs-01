public class hierarchicalInheritance {
    void  bankname(){
        String name ="BOB";
        System.out.println(name);
    }
    
}
class coustmer1 extends hierarchicalInheritance {
void countNo(){
    int number= 251414906;
    System.out.println(number);
}
}
class savings1 extends hierarchicalInheritance{
void rupees(){
    double num=5647.95;
    System.out.println(num);
}
}
class mulher{
public static void name(String args) {
    savings1 obj = new savings1();
    coustmer1 obj1= new coustmer1();
    obj.bankname();
    obj.rupees();
    obj1.countNo();
    obj1.bankname();
}
}
