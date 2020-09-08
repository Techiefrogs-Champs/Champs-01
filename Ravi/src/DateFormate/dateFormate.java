package DateFormate;
import java.util.Date; 
import java.time.Instant; 
import java.util.Calendar; 

public class dateFormate {
    public static void main(String[] args) 
    { 
        // Date d1 = new Date(); 
        // System.out.println("Current date is " + d1); 

        // Instant inst1 = Instant.now(); 
        // System.out.println("Present: "+ d1.from(inst1)); 

        // Calendar c1 = Calendar.getInstance(); 
        // c1.set(Calendar.MONTH, 00); 
        // c1.set(Calendar.DATE, 30); 
        // c1.set(Calendar.YEAR, 2019);  
        
        // Instant inst2 = d1.toInstant(); 
  
        // System.out.println("Date: " + d1.from(inst2)); 


        Date d1 = new Date(2000, 11, 21); 
        Date d2 = new Date();  // Current date 
        Date d3 = new Date(2010, 1, 3); 
  
        boolean a = d3.after(d1); 
        System.out.println("Date d3 comes after " + "date d2: " + a); 
  
        boolean b = d3.before(d2); 
        System.out.println("Date d3 comes before "+ "date d2: " + b); 
  
        int c = d1.compareTo(d2); 
        System.out.println(c); 
  
        System.out.println("Miliseconds from Jan 1 "+ "1970 to date d1 is " + d1.getTime()); 
  
        System.out.println("Before setting "+d2); 
        d2.setTime(204587433443L); 
        System.out.println("After setting "+d2); 
    } 
}