import java.util.*;
class Setdemo
{
public static void main(String args[])
{
HashSet<String> h=new HashSet<String>();
h.add("ece");
h.add("cse");
h.add("it");
h.add("cse");
System.out.println(h);
System.out.println("set contains cse or not:"+h.contains("cse"));
h.remove("it");
System.out.println("after removing set is:"+h);
//linkedhash set
LinkedHashSet<String> l=new LinkedHashSet<String>(); 
System.out.println("linked hashset data"); 
l.add("final year");
l.add("bigdata");
l.add("lab");
System.out.println("set is empty or not:"+l.isEmpty());
System.out.println(l);
//Tree set
TreeSet<String> t=new TreeSet<String>();
System.out.println("tree hashset data");
t.add("lab");
t.add("bigdata");
t.add("hadoop");
System.out.println("set size:"+t.size());
System.out.println(t);
Iterator i=h.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}