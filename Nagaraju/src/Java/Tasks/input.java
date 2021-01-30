package Tasks;

import java.util.LinkedList;
import java.util.Scanner;
 
public class input {
 
	Scanner scan;
	LinkedList<String> list;
	
	int n;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		list = new LinkedList<String>();
		
		System.out.println("Linked List - Create & Insert");
		
		System.out.println("\nEnter 'n' value");
		n = scan.nextInt();
		
		System.out.println("Enter the data");
 
		for(int i=0; i<n; i++) {
			
			list.add(scan.next());
		}
	}
	
	void display() {
		
		System.out.println("\nThe Linked List");
 
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		input obj = new input();
		
		obj.getVal();
		obj.display();
	}
}
