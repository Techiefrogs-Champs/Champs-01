public class Program_3 {
	public static void main(String[] args) {
		Area_1 obj=new Area_1();
		obj.Areas(5,6);
		obj.Areas(5);
	}
}
class Area_1{
  public static void Areas(int l,int b){
    System.out.println(l*b);
  }
  public static void Areas(int a){
    System.out.println(a*a);
  }
}
