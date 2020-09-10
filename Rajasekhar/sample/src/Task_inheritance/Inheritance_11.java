/* In this exercise, a subclass called Cylinder is derived from the superclass Circle as shown in the 
class diagram (where an an arrow pointing up from the subclass to its superclass). 
Study how the subclass Cylinder invokes the superclass' constructors (via super() and super(radius)) and 
inherits the variables and methods from the superclass Circle.

Write a test program (says TestCylinder) to test the Cylinder class 

Method Overriding and "Super": The subclass Cylinder inherits getArea() method from its superclass Circle.
 Try overriding the getArea() method in the subclass Cylinder to compute the surface area 
 (=2π×radius×height + 2×base-area) of the cylinder instead of base area. That is, if getArea() is called by 
 a Circle instance, it returns the area. If getArea() is called by a Cylinder instance, it returns the 
 surface area of the cylinder.If you override the getArea() in the subclass Cylinder, 
 the getVolume() no longer works. This is because the getVolume() uses the overridden getArea() method 
 found in the same class. (Java runtime will search the superclass only if it cannot locate the method 
 in this class). Fix the getVolume().
Hints: After overridding the getArea() in subclass Cylinder, you can choose to invoke the getArea() of
 the superclass Circle by calling super.getArea(). */

 package src.Task_inheritance;

