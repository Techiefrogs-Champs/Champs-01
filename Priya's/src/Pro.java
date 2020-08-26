class Pro{
    void operator(int a, long b, long c){
        System.out.println(a*b*c);
    }
    void operator(int a, int b, int c){
        System.out.println(a*b*c);
    }

     public static void main(String[] args) {
        Pro p = new Pro();
        p.operator(21, 22, 23);
        p.operator(21, 22, 24);
    }
}


















