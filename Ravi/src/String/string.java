package src.String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

//import sun.security.util.Length;

public class string {
    public static String lcp(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }
    public static void main(String[] args) throws Exception { 
        
        //1
        String string = "The best of both worlds";    
        int count = 0;    
             
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }        
        System.out.println("Total number of characters in a string: " + count);   
        
      
      //3
        int countPuncMarks = 0;  
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";  
        for (int i = 0; i < str.length(); i++) {  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
    


        //4
        int vCount = 0, cCount = 0;  
        String stri = "This is a really simple sentence";  
          
        
        str = stri.toLowerCase();  
          
        for(int i = 0; i < stri.length(); i++) {  
            if(stri.charAt(i) == 'a' || stri.charAt(i) == 'e' || stri.charAt(i) == 'i' || stri.charAt(i) == 'o' || stri.charAt(i) == 'u') {  
                vCount++;  
            }  
            else if(stri.charAt(i) >= 'a' && stri.charAt(i)<='z') {    
                cCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);


        //5
        String str1="ravi";  
        String str2="ivra";  
  
    
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
      
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
         
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
          
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  


        //6
        String strg = "aaaabbbbcccc";  
        int len = strg.length();  
        int n = 3;  
        int temp = 0, chars = len/n;    
        String[] equalStr = new String [n];  
       
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                String part = strg.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
        System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  

            //7
            String str3 = "FUN";  
            int len1 = str3.length();  
            int temp1 = 0;  
          
            String arr[] = new String[len1*(len1+1)/2];  
      
           
            for(int i = 0; i < len1; i++) {  
              
                for(int j = i; j < len1; j++) {  
                    arr[temp1] = str3.substring(i, j+1);  
                    temp1++;  
                }  
            }  
      

            System.out.println("All subsets for given string are: ");  
            for(int i = 0; i < arr.length; i++) {  
                System.out.println(arr[i]);  
            }  

            //8
            String st = "acbdfghybdf";  
            String lrs="";  
            int N = st.length();  
            for(int i = 0; i < N; i++){  
                for(int j = i+1; j < N; j++){  
                    String x = lcp(st.substring(i,N),st.substring(j,N));  
                    if(x.length() > lrs.length()) lrs=x;  
                }  
            }  
            System.out.println("Longest repeating sequence: "+lrs);  


            // 10
            String str4 = "  kuchi pudi ravi teja        "; 
            str4 = str4.replaceAll("\\s", ""); 
           
            System.out.println(str4); 

            //11
            String str5="Great Power";  
            StringBuffer newStr=new StringBuffer(str5);  
              
            for(int i = 0; i < str5.length(); i++) {  
                if(Character.isLowerCase(str5.charAt(i))) {  
                    newStr.setCharAt(i, Character.toUpperCase(str5.charAt(i)));  
                }  
                else if(Character.isUpperCase(str5.charAt(i))) {  
                    newStr.setCharAt(i, Character.toLowerCase(str5.charAt(i)));  
                }  
            }  
            System.out.println("String after case conversion : " + newStr);  

        //12
        String str6 = "Once in a blue moon";    
        char ch = '-';     
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);  

        
        //13
            // String str7, rev = "";
            // Scanner sc = new Scanner(System.in);
    
            // System.out.println("Enter a string:");
            // str7 = sc.nextLine();
        
            // int length = str7.length();
        
            // for ( int i = length - 1; i >= 0; i-- )
            //     rev = rev + str7.charAt(i);
        
            // if (str7.equals(rev))
            //     System.out.println(str7+" is a palindrome");
            // else
            //     System.out.println(str+" is not a palindrome");
                
            //     sc.close();


        //14 

        String str12 = "abcde", str13= "deabc";  
          
        if(str12.length() != str13.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            
            str12 = str12.concat(str12);  
              
         
            if(str12.indexOf(str13) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  

        //16

        String str8="Raviteja";

        String reves="";
        for (int i=str8.length()-1; i>=0;i--){
            reves=reves+str8.charAt(i);
        }
        System.out.println(reves);

        //17
        String str9 = "Raviteja Ravi";
        char[] carray = str9.toCharArray();
        System.out.println("The string is:" + str9);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str9.length(); i++) {
            for (int j = i + 1; j < str9.length(); j++) {
                if (carray[i] == carray[j]) {
                System.out.print(carray[j] + " ");
                break;
                }
            }
        }

        //18

        String str14 = "Big black bug bit a big black dog on his big black nose";  ;
        int cnt;
        str14 = str14.toLowerCase();  
        String words[] = str14.split(" ");  
          
        System.out.println("Duplicate words in a given string : ");   
        for(int i = 0; i < words.length; i++) {  
            cnt = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    cnt++;  
                    words[j] = "0";  
                }  
            }  
               if(cnt > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  

        //19

        String str16 = "picture perfect";    
        int[] freq = new int[str16.length()];    
        int i, j;    
 
        char strin[] = str16.toCharArray();    
            
        for(i = 0; i <str16.length(); i++) {    
            freq[i] = 1;    
            for(j = i+1; j <str16.length(); j++) {    
                if(strin[i] == strin[j]) {    
                    freq[i]++;       
                    strin[j] = '0';    
                }    
            }    
        }        
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(strin[i] != ' ' && strin[i] != '0')    
                System.out.println(strin[i] + "-" + freq[i]);    
        }  
        
        //20
    //   String strin1 = "Hardships often prepare ordinary people for an extraordinary destiny";    
    //   String word = "", small = "", large="";    
    //   String[] wor = new String[100];    
    //   int length = 0;    
          
     
    //   string = string + " ";    
          
    //   for(int i2 = 0; i2 < strin1.length(); i2++){    
      
    //       if(strin1.charAt(i2) != ' '){    
    //           word = word + strin1.charAt(i2);    
    //       }    
    //       else{    
              
    //         wor[length] = word;    
            
    //           length++;    
           
    //           word = "";    
    //       }    
    //   }            
        
    //   small = large = wor[0];    
          
  
    //   for(int k = 0; k < length; k++){    
 
    //       if(small.length() > wor[k].length())    
    //           small = wor[k];    
    
    //       if(large.length() < wor[k].length())    
    //           large = wor[k];    
    //   }    
    //   System.out.println("Smallest word: " + small);    
    //   System.out.println("Largest word: " + large);  

      //22
            // int count3 =0;
            // File file = new File("data");
            // FileInputStream fi = new FileInputStream(file);
            // byte[] bytesArray = new byte[(int)file.length()];
            // fi.read(bytesArray);
            // String s = new String(bytesArray);
            // String [] data = s.split(" ");
            // for (int i4=0; i4<data.length; i4++) {
            //     count3++;
            // }
            // System.out.println("Number of characters in the given file are " +count3);

       //23
       String str10 = "characters";  
 
        System.out.println("Individual characters from given string:");  
          
      
        for(int i1 = 0; i1 < str10.length(); i1++){  
            System.out.print(str10.charAt(i1) + "  ");  
        }  

        //24

        String a = "Ravi";  
        String b = "Teja";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }    
    
}