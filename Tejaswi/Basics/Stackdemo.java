import java.util.*;
class Stackdemo
{
public static void main(String args[])
{
int ch;
Scanner s=new Scanner(System.in);
Stack <String>b=new Stack<String>();
System.out.println("1.push()\n2.pop()\n3.peek()\n4.empty()\n5.search()\n6.display\n7.exit()");
while(true)
{
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter the element to push"); 
b.push(s.next());
break;
case 2:System.out.println("the element poped from stack:"+b.pop());
//b.pop();
break;
case 3:System.out.println("the element on the top of the stack:"+b.peek());
break;
case 4:System.out.println("the stack is empty or not:"+b.empty());
//b.empty();
break;
case 5:System.out.println("enter the element to search"); 
System.out.println("the search element:"+b.search(s.next()));
break;
case 6:System.out.println("stack:"+b);
break;
case 7: System.exit(0);
}
}
}
}