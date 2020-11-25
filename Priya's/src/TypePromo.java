class TypePromo{
    void operator(int a, long b, long c){
        System.out.println(a*b*c);
    }
    void operator(int a, int b, int c){
        System.out.println(a*b*c);
    }

     public static void main(String[] args) {
        TypePromo p = new TypePromo();
        p.operator(21, 22, 23); // the int parameters are promoted to long datatypes
        p.operator(21, 22, 23);
    }
}


















