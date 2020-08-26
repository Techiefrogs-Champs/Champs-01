package src.con_overloading;
public class Car {
    int modelYear;
    String modelName;
    String modelcolor;
  public Car(){
      System.out.println("this is default constructor");
  }

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
    System.out.println(modelYear + " " + modelName);
  }
  public Car(int year, String name,String color) {
      modelYear = year;
      modelName = name;
      modelcolor = color;
      System.out.println(modelYear + " " + modelName +" " +modelcolor);
  }

    public static void main(String[] args) {
      Car mycar1 = new Car();
      Car myCar2 = new Car(2020,"inoova");
      Car myCar3 = new Car(2020,"inoova","bluecolor"); 
    }
    
  
}