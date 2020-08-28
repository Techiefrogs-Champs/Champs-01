class Stu {
    int rno;
    String name;
    String adres,phno;
    Stu(int x,String y,String z,String p){
        rno=x;
        name=y;
        adres=z;
        phno=p;
    }
    void display(){
        System.out.println(rno+"    "+name+"    "+adres+"   "+phno);
    }
}
class Practice_2{

    public static void main(String args[]){
        Stu s1=new Stu(101,"sam","vizag","789466123");
        Stu s2=new Stu(102,"Jhon","rajamundry","789256323");
        s1.display();
        s2.display();
    }
}