package Strings;

public class NumericString {
    public static void main(String[] args) {
        String s1="Phani2";
        int i;
        char str[]=s1.toCharArray();
        int n=str.length;
        for(i=0;i<n;i++){
            if(str[i]>='0'&&str[i]<='9'&&str[i]>='a'&&str[i]<='z'||str[i]>='A'&&str[i]<='Z')
                System.out.println("The string is Numeric");
        
        else
            System.out.println("The string is ALPHABETICAL");
        
       // else if(str[i]>='a'&&str[i]<='z'||str[i]>='A'&&str[i]<='Z'){
       //     System.out.println("The String is Alphabetical");
       // }
        
    }
    }
}