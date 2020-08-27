 class Animal{
    public void sound(){
       System.out.println("Animal is making a sound");   
    }
 }
 class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
    class polymo2{
    public static void main(String args[]){
    	Animal obj = new Cat();
    	obj.sound();
    }
}