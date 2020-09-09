 class Twelve
{ 
      public static void main(String args[])
 { 
        try 
        { 
            Class.forName("Teja"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            ex.printStackTrace(); 
        } 
    } 
}