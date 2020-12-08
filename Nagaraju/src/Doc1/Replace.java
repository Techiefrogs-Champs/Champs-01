package Doc1;

import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Red");
        al.add("Green");
        al.add("White");
        al.set(1,"Yellow");
        System.out.println(al);

    }   
}
