package src.Polymorphism;

class Parent { 

	public void Print() 
	{ 
		System.out.println("parent class"); 
	} 
} 

class Childclass1 extends Parent { 
	public void sniff(){
        System.out.println("sniff ");
    }

	public void Print() 
	{ 
		System.out.println("Child class"); 
	} 
} 

 

			abstract class Practice {
				public abstract void Testing();
			}
			
			class Example1 extends Practice {
				@Override
				public void Testing() {
				System.out.println("Example One Executing");
				}
			}
			
			class Example2 extends Practice {
				@Override
				public void Testing() {
				System.out.println("Example Two Executing");
				}
			}


			class classA1{  
				public  void draw(){System.out.println("classA1...");}  
				}  
				class classA2 extends classA1{  
				public void draw(){System.out.println("classA2...");}  
				}  
				class classA3 extends classA1{  
				public void draw(){System.out.println("classA3...");}  
				}  
				class classA4 extends classA1{  
				public void draw(){System.out.println("classA4...");}  
				} 

			// class A{  
			// 	protected void msg(){System.out.println("Hello java");}  
			// }
			class Bike{  
				int speedlimit=90;  
			}  

public class Methodoveriding extends Bike { 

	// void msg(){
	// 	System.out.println("Hello java");  //C.T.Error  
	// }

				int speedlimit=150;  
  

	public static void main(String[] args) 
	{ 

		Parent a; 

		a = new Childclass1(); 
		a.Print(); 

		
		
        Example1 e1=new Example1();
		e1.Testing();
		
        Example2 e2=new Example2();
		e2.Testing();
		
		classA1 s;  
		s=new classA2();  
		s.draw();  
		s=new classA3();  
		s.draw();  
		s=new classA4();  
		s.draw();
		classA1 obj1=new classA3();
		obj1.draw();

		Bike obj=new Methodoveriding();  
		System.out.println(obj.speedlimit);//90  

	} 
} 
