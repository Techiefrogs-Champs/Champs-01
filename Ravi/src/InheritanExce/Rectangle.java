package src.InheritanExce;




class Rectangle1
{
    int length,breadth,side;

        public Rectangle1(int l, int b)
        {
            length = l;
            breadth = b;
        }

    void print_area()
    {
        System.out.println(length*breadth);
    }

    void print_perimeter()
    {
        System.out.println(2*(length+breadth));
    }
};

class Square extends Rectangle1
{
 
    int side;
    public Square(int s){
      super(s,s);
    }

    
};



public class Rectangle {
    public static void main(String[] args){
        Rectangle1 r=new Rectangle1(4,7);
        Square s=new Square(3);    
        r.print_area();
        r.print_perimeter();
        s.print_area();
        s.print_perimeter();

        Square[] a = new Square[10];
        int k = 5;
        for(int i = 0;i<10;i++){
        a[i] = new Square(k);
        k++;
        }

        for(int i = 0;i<10;i++){
        a[i].print_area();
        a[i].print_perimeter();
        }
        
    }
    
}
