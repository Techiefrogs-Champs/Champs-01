package ThisKeyword;
/*Invoke current class constructor*/
class Account{
String name;
int balance;
Account(String n){
  name = n;
  System.out.println("Happy coding");
}
Account(String n, int b){
  this(n);
  balance = b;
}
void printInfo(){
  System.out.println("Name: " + name + " Balance: " + balance);
}
}
class Analyse6{
public static void main (String[] args) {
  Account ac = new Account("Peter", 5000);
  ac.printInfo();
}
}


/* Happy coding
Name: Peter Balance: 5000*/