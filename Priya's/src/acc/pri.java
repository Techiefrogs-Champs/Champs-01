package acc;

 class pri {
    private int data = 40;
    private void msg(){
        System.out.println("PRIVATE DATA ACCESSIBLE");
    }

    public static void main(String[] args) {
        pri P = new pri();
        System.out.println("PRIVATE DATA NUMBER: "+P.data );
        P.msg();
    }
}