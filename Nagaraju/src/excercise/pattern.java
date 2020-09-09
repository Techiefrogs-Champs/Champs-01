package excercise;
import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        int i,j,r;
        char c;
        Scanner sc = new Scanner(System.in);
do {
    System.out.println("Enter number of rows:");
    while(!sc.hasNextInt()){
        System.out.println("That is not a number");
        sc.next();
    }
    r = sc.nextInt();
}
while(r <= 0);
System.out.println("You entered a valid number:"+r);
System.out.println("Enter Symbol:");
c=sc.next().charAt(1);
for(i=1; i<=r; i++){
    for(j=1; j<=i; j++){
        System.out.print(c);
    }
    System.out.println(" ");
}
    }
    
}