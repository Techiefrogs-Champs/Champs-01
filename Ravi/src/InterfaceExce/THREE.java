package src.InterfaceExce;




public class THREE extends TWO{

    ONE foo() 
    {
        TWO bar = new TWO();
        return (ONE) bar;
    } 
   
    public static void main(String[] args){
        THREE obj = new THREE();
        obj.foo();     
          
    }
}