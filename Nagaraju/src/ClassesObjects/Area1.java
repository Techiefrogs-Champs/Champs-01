package ClassesObjects;
import java.util.Scanner;

//Write a program to print the area of a rectangle by creating a class named 'Area' 
//taking the values of its length and breadth as parameters of its constructor 
//and having a method named 'returnArea' which returns the area of the rectangle. 
//Length and breadth of rectangle are entered through keyboard.

class Area2 {
    int length;
    int breadth;
    public Area2(int l, int b) {
        length=l;
        breadth=b;
    }
    public int returnArea(){
        return length*breadth;
    }
}
class Area3{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length:");
        int l= s.nextInt();
        System.out.println("Enter the breadth:");
        int b= s.nextInt();

        Area2 a = new Area2(l,b);
        System.out.println("Area of Rectangle is:"+a.returnArea());

    }
}