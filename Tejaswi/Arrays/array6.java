
import  java.util.*;

class array6
{
public static void main(String args[])
{
int x[][]= new int[4][4];

x[0][0]=2;
x[0][1]=5;
x[0][2]=9;
x[0][3]=10;

x[1][0]=2;
x[1][1]=5;
x[1][2]=9;
x[1][3]=10;

int y;
y=x[0][0]+x[0][1]+x[0][2]+x[0][3]+x[1][0]+x[1][1]+x[1][2]+x[1][3];


System.out.println("the sum  is "+y);
}
}