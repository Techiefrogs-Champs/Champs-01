package Patterns_2;

class Pattern2_7 {
    public static void main(String[] args) {
		int k;
		for(int i = 4; i >= 1; i--) {
			for(int j = 1; j <= 4; j++) {
				if(j <= i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			for(int j = 4; j >= 1; j--) {
				if(j <= i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
    
}