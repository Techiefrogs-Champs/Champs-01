/* Consider a superclass PurchaseItem which models customer’s purchases. This class has:
•	two private instance variables name (String) and unitPrice (double).
•	One constructor to initialize the instance variables.
•	A method getPrice that returns the unitPrice.
•	Accessor and mutator methods.

Consider two subclasses WeighedItem and CountedItem. 
WeighedItem has an additional instance variable weight (double) in Kg while CountedItem has an additional variable quantity (int) both private.
- Write an appropriate constructor for each of the classes making use of the constructor of the superclass in defining those of the subclasses. 
- Override getPrice method that returns the price of the purchasedItem based on its unit price and weight (WeighedItem), or quantity (CountedItem).  Make use of getPrice of the superclass
Write an application class Challenge where you construct objects from the two subclasses and print them on the screen.
 */

package src.Task_inheritance;

