package Encapsulation;

class Encapsulation {
    public static void main(String args[])
    {
        Bank b=new Bank();
        b.setAccno(5529);
        b.setName("phani");
        b.setBalance(599000000);
        System.out.println("Acc no="+b.getAccno());
        System.out.println("Name="+b.getName());
        System.out.println("Balance="+b.getBalance());
    }

}