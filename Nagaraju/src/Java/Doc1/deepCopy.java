package Doc1;
import java.util.ArrayList;
import java.util.Collections;
 
public class deepCopy {
 
  public static void main(String[] args) {
     
    //create first ArrayList object
    ArrayList arrayList1 = new ArrayList();
   
    //Add elements to ArrayList
    arrayList1.add("1");
    arrayList1.add("2");
    arrayList1.add("3");
   
    //create another ArrayList object
    ArrayList arrayList2 = new ArrayList();
   
    //Add elements to Arraylist
    arrayList2.add("One");
    arrayList2.add("Two");
    arrayList2.add("Three");
    arrayList2.add("Four");
    arrayList2.add("Five");
    System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);
   
    Collections.copy(arrayList2,arrayList1);
 
    System.out.println("After copy, Second ArrayList Contains : " + arrayList2);   
  }
}
    

