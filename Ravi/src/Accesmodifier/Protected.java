package src.Accesmodifier;

public class Protected {

    protected  void projectedDisplay(){
        System.out.println("protected access modifier is accessible within package and outside the package but through inheritance only");
    }
    protected  void projectedDisplay2(int x,int y){
        int z = x + y;
        System.out.println(z);
    }

    protected int addTwoNumbers(int a, int b){
        return a+b;
       }
}




