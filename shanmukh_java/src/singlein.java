class bank2 {
    
        String name ="BOB";

		public void banknames() {
		}
        
    
    
}
class bank3 extends bank2 {
void bankname(){
    String name= "state bank";
}
    
public void banknames() {
    System.out.println(super.name);
}
    

}

public class singlein{
public static void main(String args[]) {
    bank2 obj4 =new bank2();
    obj4.banknames();
}
}