package Patterns;


public class Pattern_11 { 
public static void main(String[] args)
{
    int i,j,k;
    for(i=0;i<=5;i++)
    {
      for(j=0;j<=5-i;j++){
      System.out.print(" ");
      }
      for(k=0;k<=i;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  
    for(i=4;i>=0;i--)
    {
      for(j=0;j<=5-i;j++){
      System.out.print(" ");
      }
      for(k=0;k<=i;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
}
}
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    */