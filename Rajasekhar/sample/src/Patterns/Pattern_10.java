package Patterns;

class Pattern_10 {

    public static void main(String[] args) {
        int rows = 4, number = 1;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}
/* 
1
2 3
4 5 6
7 8 9 10
*/