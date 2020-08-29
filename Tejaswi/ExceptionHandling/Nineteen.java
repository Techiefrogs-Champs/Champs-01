 class ClassA 
{				
int i;
   }
 class  ClassB extends ClassA
{	
     void  bMethod ( )	
{ 
              System.out.println("class b");
           
}
}
  class Nineteen
{
		 
        public static void main(String []args)
{
ClassA anInstanceA = new ClassA( );
ClassB anInstanceB =  new ClassB();
            	// Exception 
			anInstanceB.bMethod (  );			}
		
       }
    