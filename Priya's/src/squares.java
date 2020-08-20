public class squares {

    private static int getSquare(int i){
        return i * i;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int result = getSquare(i);
            System.out.println("Square of " + i + " = " + result);
        }
    }
} 