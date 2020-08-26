package exceptionhandling;

    class ClassA {				
		int i;
	   }

        class  ClassB extends ClassA{		
	     
	      void  bMethod ( )	{ 
              System.out.println("class b");
           }
	   }

	   class pro19 {
		 
        public static void main(String []args){
			ClassA anInstanceA = new ClassA( );
            ClassB anInstanceB = /*new ClassB( );*/(Class B ) anInstanceA;
            	// Exception 
			anInstanceB.bMethod (  );
			}
		
       }
    
