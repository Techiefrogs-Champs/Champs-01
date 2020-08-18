package src.LoopExec;

public class pyramid {


    
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        char last = 'E', alphabet = 'A';

        for(int i = 1; i <= (last-'A'+1); ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int rows1 = 5, k = 0;

        for(int i = 1; i <= rows1; ++i, k = 0) {
            for(int space = 1; space <= rows1 - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        int rows2 = 5, k1 = 0, count = 0, count1 = 0;

        for(int i = 1; i <= rows2; ++i) {
            for(int space = 1; space <= rows2 - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while(k1 != 2 * i - 1) {
                if (count <= rows2 - 1) {
                    System.out.print((i + k1) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i + k1 - 2 * count1) + " ");
                }

                ++k1;
            }
            count1 = count = k1 = 0;

            System.out.println();
        }


        int rows3 = 5;

        for(int i = rows3; i >= 1; --i) {
            for(int space = 1; space <= rows3 - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

        int rows4 = 6, coef = 1;

        for(int i = 0; i < rows4; i++) {
            for(int space = 1; space < rows4 - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 1) / j;

                System.out.printf("%4d", coef);
            }

            System.out.println();
        }

        int rows5 = 4, number = 1;

        for(int i = 1; i <= rows5; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }

            System.out.println();
        }


    }
    
}