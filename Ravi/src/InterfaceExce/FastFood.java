package src.InterfaceExce;

interface FastFood1{
    void rice();
    void FastFoodPrice();
    void FastFoodQuality();
}
class Sandwic implements FastFood1{
    
    public void rice(){
        System.out.println("rice");
    }
    public void FastFoodPrice(){
        System.out.println("FastFoodPrice");
    }
    public void FastFoodQuality(){
        System.out.println("FastFoodQuality");
    }     
    public void Sandwic(){
        System.out.println("Sandwic");
    }
    public static void main(String args[]){
        Sandwic obj=new Sandwic();
        obj.FastFoodPrice();
        obj.Sandwic();
        obj.rice();
        obj.FastFoodQuality();
    }
    
}