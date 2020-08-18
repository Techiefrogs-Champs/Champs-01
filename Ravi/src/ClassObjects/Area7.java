package src.ClassObjects;

import java.util.Scanner;

public class Area7 {

    int length,breadth;
    public Area7(int L,int B){
        this.length=L;
        this.breadth=B;
    }
    public int getArea(){
        int result= length*breadth;
        return result;
    }
    
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int L,B;
       
        System.out.println("Enter Length");
        L = s.nextInt();
        System.out.println("Enter Breadth");
        B = s.nextInt();
        Area7 obj=new Area7(L,B);
        System.out.println("Area:"+obj.getArea());
    }


    
}