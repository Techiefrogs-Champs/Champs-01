package java2blog.stack;

public class stackArray {
    int size;
	int arr[];
	int top;
 
    stackArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek() {
		if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		stackArray stackArray = new stackArray(10);
		stackArray.pop();
		System.out.println("=================");
		stackArray.push(10);
		stackArray.push(30);
		stackArray.push(50);
		stackArray.push(40);
		System.out.println("=================");
		stackArray.pop();
		stackArray.pop();
		stackArray.pop();
		System.out.println("=================");
	}
}
