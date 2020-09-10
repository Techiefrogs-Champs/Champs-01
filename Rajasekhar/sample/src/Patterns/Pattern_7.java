package Patterns;

class Pattern_7 {
    public static void main(String[] args) {
		int i,j,x=4;
        for (i=1; i<=5;i++){
		   for( j=1; j<=x; j++){
			   System.out.print(" ");
		   }
		   for( j=0; j<i;j++){
			   System.out.print(i+j );
		   }
		   for (j=i-2; j>=0;j--){
			   System.out.print(i+j );
		   }
			System.out.println();
			x--;
		}
    }	
}
/*
        1
       232
      34543
     4567654
    567898765  */