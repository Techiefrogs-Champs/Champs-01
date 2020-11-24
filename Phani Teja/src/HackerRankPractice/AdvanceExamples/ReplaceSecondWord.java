package HackerRankPractice.AdvanceExamples;
import java.util.ArrayList;
public class ReplaceSecondWord {
   

    public static void main(String[] args) {
        ArrayList<String>  color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);
  System.out.println("Replace second element with 'White'."); 
  System.out.println(color);
  }
    }

