package javaconcepts;

public class pro7 {
    public static void main(String []args){
        char ch='@';
        if(ch>='a' && ch<='z'){
            System.out.println("the character is an lowercase alphabet" );
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("the character is an uppercase alphabet");
        }
        else {
            System.out.println("the character is not an alphabet");
        } 
    }
}