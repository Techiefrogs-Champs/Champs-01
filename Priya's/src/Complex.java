 class Complex {
 int real;
 int img;
 
 public Complex(int r, int i){
     real = r;
     img = i;
 }
 public static Complex add(Complex a, Complex b){
     return new Complex((a.real+b.real),(a.img+b.img));
 }
public static Complex diff(Complex a, Complex b) {
    return new Complex((a.real-b.real), (a.img-b.img));
}
public static Complex product(Complex a, Complex b) {
    return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.real)-(a.img*b.img)));
}
public void printComplex(){
    if (real == 0 && img!= 0) {
        System.out.println(img+" i ");
    } else if(img == 0 && real!= 0) {
        System.out.println(real);
    }
    else {
        System.out.println(real+" + "+img+" i ");
    }
}
}

class Answer{
    public static void main(String[] args) {
        Complex c = new Complex(5, 6);
        Complex c1 = new Complex(7, 9);

        Complex e = Complex.add(c,c1);
        Complex f = Complex.diff(c,c1);
        Complex g = Complex.product(c,c1);
        e.printComplex();
        f.printComplex();
        g.printComplex();        

    }
}