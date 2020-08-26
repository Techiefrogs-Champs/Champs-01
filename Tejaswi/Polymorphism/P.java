class Demo {
 public void displayPattern(){
   for(int i = 0; i < 10; i++) {
     System.out.print("*");
   }
 }

 public void displayPattern(char symbol) {
   for(int i = 0; i < 10; i++) {
     System.out.print(symbol);
   }
 }
}

class P {
 public static void main(String[] args) {
   Demo d1 = new Demo();
   d1.displayPattern();
   System.out.println("\n");
   d1.displayPattern('#');
 }
}