public class getsetmedhods {

  public static void main(String[]  args){
  getsetmedhods obj3 =new getsetmedhods();
  obj3.setName("shanmukh");

  System.out.println(obj3.getName());
  }
    private String name; 

  
  public String getName() {
    return name;
  }

  
  public void setName(String newName) {
    this.name = newName;
  }
}