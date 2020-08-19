public class Alphabets_print {  
    int ch; 
 
   void uppercaseAlphabets()  { 
       for (char c = 'A'; c <= 'Z'; ++c) 
           System.out.print(" " + c); 
 
       System.out.print("\n"); 
   } 
   void lowercaseAlphabets() { 
       for (char c = 'a'; c <= 'z'; ++c) 
           System.out.print(" " + c); 
 
       System.out.print("\n"); 
   } 
   public static void main(String[] args) { 
       System.out.println("Uppercase Alphabets"); 
       Alphabets_print ob = new Alphabets_print(); 
       ob.uppercaseAlphabets(); 
 
       System.out.println("Lowercase Alphabets "); 
       ob.lowercaseAlphabets(); 
}
}