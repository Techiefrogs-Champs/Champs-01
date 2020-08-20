class Complex{
  int real;
  int img;
  public Complex(int r, int i)
{
    real = r;
    img = i;
  }
  public static Complex add(Complex a, Complex b)
{
    return new Complex((a.real+b.real),(a.img+b.img));
  }
  public static Complex diff(Complex a, Complex b)
{
    return  new Complex((a.real-b.real),(a.img-b.img));
  }
  public static Complex product(Complex a, Complex b)
{
    return  new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
  }
  public void printComplex()
{
    if(real == 0 && img!=0)
{
      System.out.println(img+"i");
    }
    else if(img == 0 && real!=0)
{
      System.out.println(real);
    }
else
{
      System.out.println(real+"+"+img+"i");
    }
  }
}
class Nine
{
  public static void main(String[] args){
    Complex c1 = new Complex(3,5);
    Complex c2= new Complex(7,3);
    Complex c3 = Complex.add(c1,c2);
    Complex c4= Complex.diff(c1,c2);
    Complex c5= Complex.product(c1,c2);
    c3.printComplex();
    c4.printComplex();
    c5.printComplex();
  }
}		