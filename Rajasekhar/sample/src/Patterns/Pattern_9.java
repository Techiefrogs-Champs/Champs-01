package Patterns;

//pascal's triangle
class Pattern_9 {
    public static void main(String[] args) {
        
        for (int i=0; i<5;i++){
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            int x=1;
            for (int j=0; j<=i;j++){
                System.out.print(x+" ");
                x=x*(i-j)/(j+1);
            }
             System.out.println();
         }
    }
}
/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */