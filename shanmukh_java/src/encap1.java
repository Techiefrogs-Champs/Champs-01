class encap{
    private int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newValue){
        age = newValue;
    }

    public void setName(String newValue){
        name = newValue;
    }

    public void setId(int newValue){
        id = newValue;
    }
}
public class encap1{
    public static void main(String args[]){
         encap obj = new encap();
         obj.setName("Shanmukh");
         obj.setAge(23);
         obj.setId(1915111062);
         System.out.println(" Name: " + obj.getName());
         System.out.println(" Id: " + obj.getId());
         System.out.println(" Age: " + obj.getAge());
    } 
}