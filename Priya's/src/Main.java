class OperatorOVER { 
  
    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Combined String -   " + s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a * b; 
        System.out.println("Product = " + c); 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        OperatorOVER obj = new OperatorOVER(); 
        obj.operator(28, 13); 
        obj.operator("PRIYA ", "NEKKANTI"); 
    } 
} 
