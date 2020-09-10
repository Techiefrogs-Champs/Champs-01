/* Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
with constructor having the three sides as its parameters. */

package src.Classes_Objects;

class Triangle2 {
    Triangle2(int a, int b, int c){
        double s = (a+b+c)/2.0;
         System.out.println( Math.pow((s*(s-a)*(s-b)*(s-c)),0.5)); 
         System.out.println((a+b+c));
    }
    
    public static void main(String [] args){
        Triangle2 t=new Triangle2(3,4,5);
    }
}