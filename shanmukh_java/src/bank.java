 class bank1 {
    void  bankname(){
        String name ="BOB";
        System.out.println(name);
    }
    
}
class coustmer extends bank1 {
void countNo(){
    int number= 251414906;
    System.out.println(number);
}
}
class savings extends coustmer{
void rupees(){
    double num=5647.95;
    System.out.println(num);
}
}
public class bank{
public static void main(String args[]) {
    savings obj = new savings();
    obj.bankname();
    obj.countNo();
    obj.rupees();
}
}