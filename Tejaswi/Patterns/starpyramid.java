

import  java.util.*;
class starpyramid
{
public static void main(String args[])
{
Scanner p=new Scanner(System.in);
int i,j,k,g,n;
System.out.println(" enter the value to print no. of rows ");
n=p.nextInt();
for(i=1;i<=n;i++)
{
for(j=n;j>=i;j--){
System.out.print("-");
}
for(k=1; k<=i;k++){

System.out.print("*"+"-");
}
System.out.println("");
}
}
}