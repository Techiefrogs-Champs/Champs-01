package Tasks;

import java.util.LinkedList;
import java.util.Scanner;
 
public class input2 {
 
	Scanner scan;
	LinkedList<String> list1;
	LinkedList<String> list2;
	int n,m;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		list1 = new LinkedList<String>();
		
		System.out.println("Linked List - Create & Insert");
		
		System.out.println("\nEnter 'n' value");
		n = scan.nextInt();
		
		System.out.println("Enter the 1st Linked List data");
 
		for(int i=0; i<n; i++) {
			
			list1.add(scan.next());
		}

		list2 = new LinkedList<String>();
		System.out.println("\nEnter 'm' value");
		m = scan.nextInt();
		System.out.println("Enter the 2nd Linked List data");
		for(int j=0; j<m; j++) {
			list2.add(scan.next());
		}
	}
	
	void display() {
		
		System.out.println("\nThe 1st Linked List");
		for(int i=0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i));
		}

		System.out.println("\nThe 2nd Linked List");
		for(int j=0; j<list2.size(); j++) {
			
			System.out.println(list2.get(j));
		}
	}
}
 
class MainClass2 {
	
	public static void main(String args[]) {
		
		input2 obj = new input2();
		
		obj.getVal();
		obj.display();
	}
}
