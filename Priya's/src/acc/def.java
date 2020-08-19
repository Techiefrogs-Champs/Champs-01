package acc;

class def {
    int a = 35;
    void disp(){
        System.out.println("DEFAULT INFO ACCESSED");
    }

    public static void main(String[] args) {
        def D = new def();
        System.out.println("DEFAULT INT NO: "+D.a);
        D.disp();
    }
}