import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("hyndayi");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "TATA Motors");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        
        System.out.println(cars);
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
      }

    
}