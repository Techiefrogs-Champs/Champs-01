package Tasks;

import java.util.*;

class Main{
    
    static int waysToParenthesize(String symbolSequence, String operatorSequence) 
    {
        int n = symbolSequence.length();
    	int T[][] = new int[n][n];
    	int F[][] = new int[n][n];
    	for(int i=0;i<n;i++){
    	    for(int j=0;j<n;j++){
    	        T[i][j] = 0;
    	        F[i][j] = 0;
    	    }
    	}
    	
    	for(int i=0;i<n;i++){
            if(symbolSequence.charAt(i) == 'T'){
                T[i][i] = 1;
                F[i][i] = 0;
            }
            else{
                T[i][i] = 0;
                F[i][i] = 1;   
            }
    	}
    
    	for(int len=2;len<=n;len++)
    	{
    		for(int i=0;i<=n-len;i++) 
    		{
    		    int j = i+len-1;
    			T[i][j] = 0;
    			F[i][j] = 0;
    			
    			for(int k=i;k<j;k++)
    			{
    				int waysik = T[i][k] + F[i][k]; 
    				int wayskj = T[k+1][j] + F[k+1][j]; 
    				if(operatorSequence.charAt(k) == '&') 
    				{ 
    					T[i][j] += T[i][k]*T[k+1][j]; 
    					F[i][j] += (waysik*wayskj - T[i][k]*T[k+1][j]); 
    				} 
    				else if(operatorSequence.charAt(k) == '|')
    				{ 
    					F[i][j] += F[i][k]*F[k+1][j]; 
    					T[i][j] += (waysik*wayskj - F[i][k]*F[k+1][j]); 
    				} 
    				else if(operatorSequence.charAt(k) == '^') 
    				{ 
    					T[i][j] += F[i][k]*T[k+1][j] + T[i][k]*F[k+1][j]; 
    					F[i][j] += T[i][k]*T[k+1][j] + F[i][k]*F[k+1][j]; 
    				}
    			} 
    		} 
    	}
    	return T[0][n-1]; 
    } 
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Symbols: ");
        String symbolSequence = sc.next();
        System.out.println("Enter Operators: ");
        String operatorSequence = sc.next();
        int ans = waysToParenthesize(symbolSequence, operatorSequence);
        System.out.println();
    	System.out.println(ans);
    }
}