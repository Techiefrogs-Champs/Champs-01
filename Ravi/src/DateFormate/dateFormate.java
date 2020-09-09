package DateFormate;

import java.util.Date; 
import java.time.Instant; 
import java.util.Calendar; 
import java.text.SimpleDateFormat;  

public class dateFormate {

    public static void main(String[] args) 
    { 

      
        Date date = new Date();
        System.out.println("Current date is " + date); 
        date.setTime(1000); 
        System.out.println("Date after setting" + " the time: "+ date); 

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String stng= format.format(date);
        System.out.println(stng);

        format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        stng = format.format(date);  
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+stng);  
  
        format = new SimpleDateFormat("dd MMMM yyyy");  
        stng = format.format(date);  
        System.out.println("Date Format with dd MMMM yyyy : "+stng);  
    
        format = new SimpleDateFormat("dd MMMM yyyy zzzz");  
        stng = format.format(date);  
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+stng);  
    
        format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
        stng = format.format(date);  
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+stng);  


        // 

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String d1 = simpleDateFormat.format(new Date());
        System.out.println(d1);


         //converting date to string using format() method

        Date date1 = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("dd, MM, yyyy"); 
        String dateString = sdf.format(date);  
        System.out.println("Date is: "+dateString);   

        //String to Date conversion using parse() method

        // String dateString1 = "11 Oct, 2017";
    	// Date date2 = DateFormat.getDateInstance().parse(dateString1); 
        // System.out.println("Date: "+date2);  



        Date d11 = new Date(2000, 11, 21); 
        Date d22 = new Date();  // Current date 
        Date d33 = new Date(2010, 1, 3); 
  
        boolean a = d33.after(d11); 
        System.out.println("Date d3 comes after " +     "date d2: " + a); 
  
        boolean b = d33.before(d22); 
        System.out.println("Date d3 comes before "+ 
                           "date d2: " + b); 
  
        int c = d11.compareTo(d22); 
        System.out.println(c); 
        System.out.println("Miliseconds from Jan 1 "+  "1970 to date d1 is " + d11.getTime()); 


        
    } 
}