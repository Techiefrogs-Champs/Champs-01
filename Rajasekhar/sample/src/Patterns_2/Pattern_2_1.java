
package Patterns_2;


public class Pattern_2_1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
					if((j==1)&((i==1)||(i==2)||(i==3)||(i==4))){
					System.out.print(5);
			} 
			if((j==2)&((i==1)||(i==2)||(i==3)||(i==5))){
				System.out.print(4);}
				if((j==3)&((i==1)||(i==2)||(i==4)||(i==5))){
				System.out.print(3);}
				if((j==4)&((i==1)||(i==3)||(i==4)||(i==5))){
				System.out.print(2);}
				if((j==4)&((i==2)||(i==3)||(i==4)||(i==5))){
				System.out.print(1);
				}
			 if ((i+j == 5)||(i==5 && j==1)){
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
	
