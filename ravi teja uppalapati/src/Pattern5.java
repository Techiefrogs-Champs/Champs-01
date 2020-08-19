public class Pattern5{
    public static void main(String[]args) {
        int i,j,n=4; 
        for(i=1;i<=n;i++){
            for(j=1;j<=2*n-1;j++){
                if(j>=n-(i-1)&&j<=n+(i-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.println(" ");
                }
             System.out.println();
            }


        }
        
    }
}