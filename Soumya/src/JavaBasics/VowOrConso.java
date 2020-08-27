package JavaBasics;

public class VowOrConso {
   // static String alp ="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
public static void main(String[] args) {
    String alp = "a";
    if(alp=="a"||alp=="e"||alp=="i"||alp=="o"||alp=="u"){
        System.out.println(alp+" is a vowel");
    }
    else{
        System.out.println(alp+" is a consonant");
    }
}
}