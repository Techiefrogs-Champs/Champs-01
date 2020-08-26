package ModifersAndMethods;

class Static{  
    static int add(int a, int b){  
    return a+b;  
    }  
    public static void main(String args[]){  
    int sum=Static.add(5,6);  
    System.out.println(sum);  
    }  
  }  