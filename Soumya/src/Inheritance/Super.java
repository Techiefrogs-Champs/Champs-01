package Inheritance;
class Name
{  
    String name="Teja";  
}  
class Details extends Name
{  
    String name="Soumya";  
    void display()
    {  
    System.out.println(name);  
    System.out.println(super.name);  
    }  
}  
class Super
{  
    public static void main(String args[])
    {  
    Details d=new Details();  
    d.display();  
    }
}