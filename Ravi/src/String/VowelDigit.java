package src.String;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class VowelDigit {
    public static void main(String[] args) throws ParseException {
    //     String line = "This website is aw3som31.";
    //     int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    //     line = line.toLowerCase();
    //     for(int i = 0; i < line.length(); ++i)
    //     {
    //         char ch = line.charAt(i);
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //             ++vowels;
    //         }
    //         else if((ch >= 'a'&& ch <= 'z')) {
    //             ++consonants;
    //         }
    //         else if( ch >= '0' && ch <= '9')
    //         {
    //             ++digits;
    //         }
    //         else if (ch ==' ')
    //         {
    //             ++spaces;
    //         }
    //     }

    //     System.out.println("Vowels: " + vowels);
    //     System.out.println("Consonants: " + consonants);
    //     System.out.println("Digits: " + digits);
    //     System.out.println("White spaces: " + spaces);
    // }

    String[] words = { "Ruby", "C", "Python", "Java" };

        for(int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for(int i = 0; i < 4; i++) {
            System.out.println(words[i]);
        }

        String sDate1="31/12/1998";  
        String sDate2 = "31-Dec-1998";  
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
        Date date1=formatter1.parse(sDate1);  
        Date date2=formatter2.parse(sDate2);  
        System.out.println(sDate1+"\t"+date1);  
        System.out.println(sDate2+"\t"+date2); 

    
        //Java Program to Compare Strings using ==
        String style = "Bold";
        String style2 = "vold";

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
       
        //Java Program to Compare Strings using equals()
            String s1="Sachin";  
            String s2="Sachin";  
            String s3=new String("Sachin");  
            String s4="Saurav";  
            System.out.println(s1.equals(s2)); 
            System.out.println(s1.equals(s3));  
            System.out.println(s1.equals(s4));

         //Java Program to Compare String objects using ==  (Doesn't work)
                    // String s1 = new String("Bold");
                    // String s2 = new String("Bold");
            
                    // if(s1 == s2)
                    //     System.out.println("Equal");
                    // else
                    //     System.out.println("Not Equal");

        // Java Program to Check if a String is Numeric (exceptions)

                    String string = "12345.15";
                    boolean numeric = true;
            
                    try {
                        Double num = Double.parseDouble(string);
                    } catch (NumberFormatException e) {
                        numeric = false;
                    }
            
                    if(numeric)
                        System.out.println(string + " is a number");
                    else
                        System.out.println(string + " is not a number");
                
                
//Java Program to Check if two strings are anagram(using char arrays)
                String str1 = "ravi";
                String str2 = "vira";

                if (str1.length()==str2.length()) {
                    char[] arr1 = str1.toCharArray();
                    Arrays.sort(arr1);
                    System.out.println(Arrays.toString(arr1));
                    char[] arr2 = str2.toCharArray();
                    Arrays.sort(arr2);
                    System.out.println(Arrays.toString(arr2));
                    System.out.println(Arrays.equals(arr1, arr2));
                    if(arr1.equals(arr2)) {
                        System.out.println("Given strings are anagrams");
                    } else {
                        System.out.println("Given strings are not anagrams");
                    }
                }
            
    
}
}