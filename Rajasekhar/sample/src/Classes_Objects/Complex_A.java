/* 9.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
with separate methods for each operation whose real and imaginary parts are entered by user. */



package src.Classes_Objects;


class Complex { 
    int real, imaginary; 
  
    Complex(){ 
    } 
    Complex(int tempReal, int tempImaginary) { 
        real = tempReal; 
        imaginary = tempImaginary; 
    } 
    Complex addComp(Complex C1, Complex C2) { 
        Complex temp = new Complex(); 
        temp.real = C1.real + C2.real; 
        temp.imaginary = C1.imaginary + C2.imaginary; 
        return temp; 
    } 
    Complex subtractComp(Complex C1, Complex C2) { 
        Complex temp = new Complex(); 
        temp.real = C1.real - C2.real; 
        temp.imaginary = C1.imaginary - C2.imaginary; 
        return temp; 
    } 
    Complex multipleComp(Complex C1, Complex C2) { 
        Complex temp = new Complex(); 
        temp.real = (C1.real * C2.real)-(C1.imaginary * C2.imaginary); 
        temp.imaginary = (C1.real * C2.real)+(C1.imaginary * C2.imaginary);
        return temp; 
    } 
    void printComplexNumber() { 
        System.out.println("Complex number: "+ real + " + "+ imaginary + "i"); 
    } 
}
public class Complex_A { 
    public static void main(String[] args) { 
        Complex C1 = new Complex(9,6); 
        C1.printComplexNumber(); 
        Complex C2 = new Complex(3,2); 
        C2.printComplexNumber(); 
        Complex C3 = new Complex(); 
        C3 = C3.addComp(C1, C2); 
        System.out.print("Sum of "); 
        C3.printComplexNumber(); 
        C3 = C3.subtractComp(C1, C2); 
        System.out.print("Difference of "); 
        C3.printComplexNumber(); 
        C3 = C3.multipleComp(C1, C2); 
        System.out.print("Multiplication of "); 
        C3.printComplexNumber();
    } 
}