package inher;

class Rectangle{
    int length,breadth;
public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

   public int getArea(){
       return length*breadth;
   }

    public int getParameter(){
      return 2*(length+breadth);
    }
}

class Square extends  Rectangle{

    public Square(int s) = Rectangle(s,s){
        
    }
	}


