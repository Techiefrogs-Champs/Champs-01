package encap.polym;

class Addition { 
  
    static int Add(int a, int b) 
    { 
        return a + b; 
    } 
    static int Add(int a, int b, int c) 
    { 
        return a + b + c; 
    } 
    
} 
  
class method { 
    public static void main(String[] args) 
    { 
  
        System.out.println(Addition.Add(2, 4)); 
        System.out.println(Addition.Add(2, 7, 3));
        
    } 
} 