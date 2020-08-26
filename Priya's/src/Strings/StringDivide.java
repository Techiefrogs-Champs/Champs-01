package Strings;
import java.util.*;

class StringDevide {

 static void splitString(String str1, int n) {
  int str_size = str1.length();
  int part_size;
  if (str_size % n != 0) {
   System.out.println("The size of the given string is not divided into equal parts by this diviser " + n);
   return;
  } else {
   System.out.println("The given string is: " + str1);
   System.out.println("The string divided into " + n + " Equal parts and they are: ");
   part_size = str_size / n;
   for (int i = 0; i < str_size; i++) {
    if (i % part_size == 0)
     System.out.println();
    System.out.print(str1.charAt(i));
   }
  }
 }
 public static void main(String[] args) {
  String str1 ;
  Scanner obj = new Scanner(System.in);
  System.out.print("please Enter a string: ");
  str1 = obj.nextLine();
  int split_number ;
  System.out.print("please Enter a diviser number i.e divided the string into equal parts: ");
  split_number = obj.nextInt();
  splitString(str1, split_number);
  obj.close();
 }
 
}
