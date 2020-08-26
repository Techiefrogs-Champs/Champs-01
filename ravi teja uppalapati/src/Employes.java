class Manager{
    int i,phno,sal;
    String name,address;
    Manager(){
       
    }
    void display(){
        System.out.println("print salary");
    }}
    class Employes extends Manager{ 
        Employes(int i,int phno, int sal,String name,String address){
            this.i=i; 
            this.phno=phno;
            this.sal=sal;
            this.name=name;
            this.address=address;

        }
        public static void main(String[] args){
            Manager obj=new Manager();
             obj.i=1;
            obj.phno=4364646;
            obj.sal=5599;
            obj.name="ravi";
            obj.address="uifeujh";
            System.out.println(obj.i+" "+obj.phno+" "+obj.sal+" "+obj.name+" "+obj.address);
            Employes obj1=new Employes(1,66,5678,"boy","wait");
            System.out.println(obj1.i+" "+obj1.phno+" "+obj1.sal+" "+obj1.name+" "+obj1.address);
            obj.display();

    }
    }

