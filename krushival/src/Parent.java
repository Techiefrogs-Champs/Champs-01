abstract class Parent {
   abstract void message();}
   class Baby_1 extends Parent{
       void message(){
           System.out.println("This is first class");
       }
    }
    class Baby_2 extends Parent{               abstract sample 1
        void message(){
            System.out.println("This is second class");
        }
    }
    class main {
        public static void main(String args[]){
            Parent obj_1 = new Baby_1();
            obj_1.message();
            Parent obj_2 = new Baby_2();
            obj_2.message();
        }
    }





    
