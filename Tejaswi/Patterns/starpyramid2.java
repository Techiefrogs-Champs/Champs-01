
import  java.util.*;
class starpyramid2
{
public static void main(String args[])
{
Scanner p=new Scanner(System.in);
int i,j,k,n;
System.out.println(" enter the value to print no. of rows ");
n=p.nextInt();
for(i=n;i>=1;i--)
{
for(k=n;k>=i;k-- ){

System.out.print("-");
}
 for(j=1;j<=i;j++){
System.out.print("*"+"-");
}


System.out.println("");
}}

}