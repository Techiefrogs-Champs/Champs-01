package Encapsulation;

class TestBankaccount{
    public static void main(String[] args) {
        Bankaccount obj=new Bankaccount();
        obj.setAccno(657);
        obj.setName("phani");
        obj.setEmail("phani@gmail.com");
        obj.setBalance(50000);
        System.out.println("Account number :"+obj.getAccno());
        System.out.println("Name of the account holder :"+obj.getName());
        System.out.println("E-mail adress of the account holder :"+obj.getEmail());
        System.out.println("Balance :"+obj.getBalance());

    }
}