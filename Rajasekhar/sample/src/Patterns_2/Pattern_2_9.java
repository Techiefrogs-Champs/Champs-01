package Patterns_2;

public class Pattern_2_9 {
	
	public static void main(String[] args) {
		for(int i=1;i<=8;i++){
			for(int j=1;j<=8;j++){
					if((j==1)||(j==8)){
					System.out.print(1);
			} if ((i==1)||(i==8)){
				System.out.print(1);
			}
			if ((i==2)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
			if ((i==3)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
		if ((i==4)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
			if ((i==5)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
			if ((i==6)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
			if ((i==7)&&((j==2)||(j==3)||(j==4)||(j==5))){
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
	