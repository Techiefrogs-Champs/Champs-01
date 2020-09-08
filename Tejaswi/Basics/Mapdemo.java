import java.util.*;
class Mapdemo
{
public static void main(String args[])
{
Map<String,String> m=new
HashMap<String,String>(); 
m.put("cse","finalyear");
m.put("ece","firstyear");
m.put("mech","secondyear");
m.put("eee","thirdyear");
System.out.println(m);
m.remove("mech");
System.out.println(m);
System.out.println(m.size());
System.out.println(m.isEmpty());
System.out.println(m.containsKey("ece"));
System.out.println(m.get("mech"));
Set s=m.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
//Linked Hash Map
LinkedHashMap<String,String> l=new LinkedHashMap<String,String>();
System.out.println("linked hashmap data");
l.put("cse","final year");
l.put("civil","first year");
System.out.println(l);
//Treemap
TreeMap<String,String> t=new TreeMap<String,String>();
System.out.println("tree map data");
t.put("cse","final year");
t.put("civil","first year");
System.out.println(t);
}
}