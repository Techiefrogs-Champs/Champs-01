/*17) Java program to find the duplicate characters in a string*/


class Duplicates_find {
        public static void main(String argu[]) {
           String str = "beautiful beach";
           int cnt;
           char[] carray = str.toCharArray();
           System.out.println("The string is:" + str);
           System.out.print("Duplicate Characters in above string are: ");
           
           for (int i = 0; i < str.length(); i++) {
            cnt=0;
              for (int j = i + 1; j < str.length(); j++) {
               
                 if (carray[i] == carray[j]) {
                  cnt++;                   
                    
                 }
                
              }
              System.out.println(str+":"+cnt);
        }
      
        
     }
    
}