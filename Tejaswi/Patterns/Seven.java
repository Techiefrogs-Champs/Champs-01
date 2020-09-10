class Seven  
{  
    public static void main(String[] args) 
{    
    int i,j,k,l;   
    for(i=0;i<4;i++){// this loop is used to print lines  
        for(j=1;j<=i;j++){// this loop is used to print space in a line  
            System.out.print(" ");  
        }  
        for(j=1;j<=4;j++){// this loop is used to print numbers in a line  
            if(j<=(4-i))  
            System.out.print(j);  
            else  
            System.out.print("*");  
        }  
        j--;  
        while(j>0){// this loop is used to print numbers in a line  
            if(j>4-i)  
            System.out.print("*");  
            else  
            System.out.print(j);  
            j--;  
        }  
    }  
}  
}  