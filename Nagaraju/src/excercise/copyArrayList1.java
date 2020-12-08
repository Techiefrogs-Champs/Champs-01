package excercise;
import java.util.ArrayList;

public class copyArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Hi");
        al1.add("Hows");
        al1.add("You");
        System.out.println(al1);
        ArrayList<String> al2 = (ArrayList<String>)al1.clone();
        System.out.println("Shallow copy of ArrayList: "+ al2);
   
        //add and remove on original ArrayList
        al1.add("Fig");
        al1.remove("Orange");
   
        //Display of both ArrayLists after add & remove
        System.out.println("Original ArrayList:"+al1);
        System.out.println("Cloned ArrayList:"+al2);

    }
    
}
