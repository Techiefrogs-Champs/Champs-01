class defaultconstructor {

    int a;
    boolean b;
 
    public defaultconstructor() {
        a = 10;
        b = true;
    }

    public static void main(String[] args) {
        defaultconstructor obj = new defaultconstructor();

        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}