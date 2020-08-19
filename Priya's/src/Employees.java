 class Employees {
    String name;
    int year_of_joining;
    String address;
    Employees(String name, int year_of_joining, String address){
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
        System.out.println(name+"  "+year_of_joining+"  "+address);
    }

public static void main(String[] args) {
   System.out.println("NAME"+" "+"   YEAR OF JOINING"+" "+"    ADDRESS");
    Employees e1 = new Employees("ROBERT ",  1994   , "        64C-WALLSTREET");
    Employees e2 = new Employees("SAM    ",  2000   , "        68D-WALLSTREET");
    Employees e3 = new Employees("JHON   ",  1999   , "        26B-WALLSTREET");
}
}

 