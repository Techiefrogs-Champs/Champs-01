package basicsprobles;

public class problem12 {
    public static void main(String[] args) {

        int s = 6, v = 120, gcd = 1;
    
        for(int i = 1; i <= s && i <= v; ++i) {
          if(s % i == 0 && v % i == 0)
            gcd = i;
        }
    
        int lcm = (s * v) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", s, v, lcm);
      }
}