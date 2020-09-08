package ThisKeyword;

class Analyse3 {
    String name;
  int balance;
  Analyse3(String name, int balance){
    this.name = name;
    this.balance = balance;
  }
  void printInfo(){
    System.out.println("Name: " + name + " Balance: " + balance);
  }
}
class This2
{
  public static void main (String[] args) {
    Analyse3 ac = new Analyse3("Peter", 5000);
    ac.printInfo();
  }
    
}


/* Output: Name: Peter Balance: 5000 */
