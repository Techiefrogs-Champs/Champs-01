/* Q-9).a).Setting up Classes with Interfaces
•	Assume you want to capture shapes, which can be either circles (with a radius and a color) or
    rectangles (with a length, width, and color). 
    You also want to be able to create signs (to post in the campus center, for example),
    each of which has a shape (for the background of the sign) and the text (a String) to put on the sign.
    b).Create classes and interfaces for circles, rectangles, shapes, and signs.
•	In order to make signs, we need to make shapes that are large enough to fit the text for the sign. 
    Write a method on shapes fitsText that takes the text as an argument and 
    determines whether the length of the text is shorter than the length/radius of the shape. 
    You can get the length of a String by calling the method length on the string.
•	Practice making errors with your shapes: 
    omit the interface, make typos in the names of the fitsText method,and so on. 
    This will help you get familiar with the errors messages that Java produces in various situations */


package src.Task_Interfaces;

public class Interface_9 {
    public static void main(String[] args) {
        Sign s1 = new Sign();
        s1.fitsText("techie frogs");
        Circle c1 = new Circle();
        c1.fitsText("techie frogs");
        Rectangle r1 = new Rectangle();
        r1.fitsText("techie frogs");
    }
}
interface IShape {
    public void fitsText(String message);
  }
  class Circle implements IShape {
    int radius;
    String color;
    public void fitsText(String message) {
        radius = 15;
        if  (message.length() < (2 * this.radius)){
            System.out.println("string: "+ message+" >>length is less than the radius: "+radius);
        }else{
            System.out.println("radius: "+radius+" >>is less than the string length: "+message);
        }
    }
  }
  class Rectangle implements IShape {
    int length;
    int width;
    String color; 
    public void fitsText(String message) {
        width = 6;
        if  (message.length() < (2 * this.width)){
            System.out.println("string length: "+message+" >>is less than the width: "+width);
        }else{
            System.out.println("width: "+width+" >>is less than the string length: "+message);
        }
    } 
  }
  class Sign implements IShape {
    String text;
    public void fitsText(String message){
        text = "this is sign board";
        System.out.println(message + ": "+text );
    }
  }