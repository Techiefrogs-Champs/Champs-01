package src.InheritanExce;

class a{
    
    int i,j;

        a(){
          this.i=5;
          this.j=10;  
        }

        void show(){
            System.out.println("ID="+ i +"name is="+j);
        }
}
class b extends a{
    int k;
    b(){
      this.k=15;  
    }
    void show(){
        System.out.println("ID is="+k);
    }

}
public class classAandB {
    public static void main(String[] args) {
        b obj=new b();
        obj.show();
    }
    
}