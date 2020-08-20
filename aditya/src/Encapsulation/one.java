package Encapsulation;

 class one {
    private int a;
    private String name;
    private float value;
    public int geta(){
        return a;
    }
    void seta(int a){
        this.a=a;
    }
     public String getname(){
        return name;
    }
    void setname(String name){
         this.name=name;    
        }
    public float getvalue(){
        return value;
    }
    void setvalue(float value){
        this.value=value;
    }
    public static void main(String []args){
        one obj=new one();
        obj.seta(2);
        obj.setname("aditya");
        obj.setvalue(199.5f);
        System.out.println("the number is=" +obj.geta());
        System.out.println("the number is=" +obj.getname());
        System.out.println("the number is=" +obj.getvalue());
     }

}