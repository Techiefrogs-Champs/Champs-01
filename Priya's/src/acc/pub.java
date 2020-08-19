package acc;

public class pub {
    int a = 1;
    String name = "PRIYA";
    int age = 21;
    public void disp(){
        System.out.println("PUBLIC INFO ACCESSED");
    }

    public static void main(String[] args) {
        pub P = new pub();
        System.out.println("PUBLIC INT: "+P.a+"PUBLIC NAME: "+P.name+"PUBLIC AGE: "+P.age);
        P.disp();
    }
}