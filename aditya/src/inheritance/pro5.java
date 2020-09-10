package inheritance;

 class Shape {
     void method1(){
         System.out.println("This is This is Shape");
     }
}
    class Rectangle1 extends Shape{
        void method2(){
        System.out.println("This is Rectangle shape");
        }
    }
    class Square1 extends Rectangle1{
        void method3(){
            System.out.println("This is square of Rectangle");

        }
    } 
    class Circle extends Shape{
        void method4(){
            System.out.println("This is circle shape");
        }
    }
    class pro5{
        public static void main(String []args){
            Square1 obj=new Square1();
            obj.method1();
            obj.method2();
            obj.method3();
           //Circle obj1=new Circle();
           //obj1.method4();
        }
    }