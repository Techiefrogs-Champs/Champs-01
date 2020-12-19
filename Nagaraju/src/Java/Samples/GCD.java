
public class GCD {
	public static void main(String[] args) {
    
        int a = 84, b = 108;
    
        while(a != b)
        {
            if(a > b)
                    a -= b;
                else
                    b -= a;
        }
    
        System.out.println("G.C.D = " + a);
    }
}