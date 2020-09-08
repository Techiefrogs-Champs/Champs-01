package ThisKeyword;

/*Refer instance variable of current class*/

class Analyse1{
    String name;
    int balance;
    Analyse1(String n, int b){
      name = n;
      balance = b;
    }
    void printInfo(){
      System.out.println("Name: " + name + " Balance: " + balance);
    }
  }
  class This0
  {
    public static void main (String[] args) {
        Analyse1 ac = new Analyse1("Peter", 5000);
        ac.printInfo();
    }
  }

  /* Output: Name: Peter Balance: 5000 */
