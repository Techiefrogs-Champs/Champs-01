package basicsprobles;

public class problem11 {
    public static void main(String[] args) {
      

            int n = 54, m = 220, gcd = 1;
    
            for(int i = 1; i <= n && i <= m; ++i)
            {
                if(n % i==0 && m % i==0)
                    gcd = i;
            }
    
            System.out.printf("G.C.D of %d and %d is %d", n, m, gcd);
        
    }
    
}