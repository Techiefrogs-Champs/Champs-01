package harish;


    class Animal {
        void eat(){
            System.out.println("eating");
        }
    }
       class dog extends Animal{
          void bark(){
              System.out.println("barking");
         }
        }
        class cat extends dog{
            void weep(){
                System.out.println("weeping");
            }
        
         public static void main(String []args){
             cat obj=new cat();
             obj.eat();
             obj.bark();
             obj.weep();
         }
      }
    
