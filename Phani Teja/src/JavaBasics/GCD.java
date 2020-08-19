package JavaBasics;

public class GCD {

    public static void main(String[] args) {
        int n1=10,n2=20;
        int gcd=1;
        for(int i=1;i<=n1&&i<=n2;++i){
            if(n1%i==0&&n2%i==0)
            gcd=i;
        }
        int lcm=(n1*n2)/gcd;//hcf*lcm=n1*n2
        System.out.println("Gcd of "+ n1 +" and "+n2 +" is :"+gcd);
        System.out.println("Lcm of "+n1+" and "+n2+" is :"+lcm);
    }
}
  