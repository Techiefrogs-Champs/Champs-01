package ThisKeyword;

class Analyse2{
    String name;
    int balance;
    Analyse2(String name, int balance){
      name = name;
      balance = balance;
    }
    void printInfo(){
      System.out.println("Name: " + name + " Balance: " + balance);
    }
  }
  class This1
  {
    public static void main (String[] args) {
        Analyse2 ac = new Analyse2("Peter", 5000);
        ac.printInfo();
    }
  }


  /* Output: Name: null Balance: 0 */