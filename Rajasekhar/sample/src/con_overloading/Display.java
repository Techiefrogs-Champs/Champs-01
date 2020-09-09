package src.con_overloading;
class Car {
    int modelYear;
    String modelName;
    String modelcolor;

    public Car(){
        System.out.println("this is default constructor");
    }
  
    public Car(int year, String name) {
      modelYear = year;
      modelName = name;
    }
    public Car(int year, String name,String color) {
        modelYear = year;
        modelName = name;
        modelcolor = color;
    }
}
public class Display {
    public static void main(String[] args) {
      Car mycar1 = new Car();
      Car myCar2 = new Car(2020,"inoova");
      Car myCar3 = new Car(2020,"inoova","bluecolor");
      //System.out.println(myCar2.modelYear + " " + myCar2.modelName);
      //System.out.println(myCar3.modelYear + " " + myCar3.modelName +" " +myCar3.modelcolor);
    }
}
