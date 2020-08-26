package javastrings;

public class Numeric {
    

        public static void main(String[] args) {
    
            String string = "12345.15";
           boolean numeric = true;
           Double num = Double.parseDouble(string);
          if(numeric){
                System.out.println(num + " is a number");
          }
                else{
                        System.out.println(num + " is not a number");
                }
       }
    }
