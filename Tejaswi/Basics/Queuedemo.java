import java.util.*;
class Queuedemo
{
public static void main(String args[])
{
int ch;
Scanner s=new Scanner(System.in);
Queue<String> b=new LinkedList<String>();
System.out.println("1.add()\n2.offer()\n3.remove()\n4.poll()\n5.element()\n6.peek()\n7.display\n8.exit");
while(true)
{
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter the element to insert"); 
b.add(s.next());
break;
case 2:System.out.println("enter the element to insert");
System.out.println("the element inserted or not:"+b.offer(s.next()));
break;
case 3:System.out.println("the element removed from queue:"+b.remove());
break;
case 4:System.out.println("the element removed from queue:"+b.poll());
break;
case 5:System.out.println("the element on the front of queue:"+b.element());
break;
case 6:System.out.println("the element on the front of queue:"+b.peek());
break;
case 7:System.out.println("Queue: "+b);
break;
case 8: System.exit(0);
}
}
}
}