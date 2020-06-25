/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Admin
 */
public class Complex {

    int real, imaginary; 
  
    // Empty Constructor 
    Complex() 
    { 
    } 
  
    // Constructor to accept 
    // real and imaginary part 
    Complex(int tempReal, int tempImaginary) 
    { 
        real = tempReal; 
        imaginary = tempImaginary; 
    } 
  
    // Defining addComp() method 
    // for adding two complex number 
    Complex addComp(Complex C1, Complex C2) 
    { 
        // creating temporary variable 
        Complex temp = new Complex(); 
  
        // adding real part of complex numbers 
        temp.real = C1.real + C2.real; 
  
        // adding Imaginary part of complex numbers 
        temp.imaginary = C1.imaginary + C2.imaginary; 
  
        // returning the sum 
        return temp; 
    } 
} 
    public class java{   
    public static void main(String[] args) {
        // TODO code application logic here
    { 
  
        // First Complex number 
        Complex C1 = new Complex(3, 2); 
  
        // printing first complex number 
        System.out.println("Complex number 1 : "
                           + C1.real + " + i"
                           + C1.imaginary); 
  
        // Second Complex number 
        Complex C2 = new Complex(9, 5); 
  
        // printing second complex number 
        System.out.println("Complex number 2 : "
                           + C2.real + " + i"
                           + C2.imaginary); 
  
        // for Storing the sum 
        Complex C3 = new Complex(); 
  
        // calling addComp() method 
        C3 = C3.addComp(C1, C2); 
  
        // printing the sum 
        System.out.println("Sum of complex number : "
                           + C3.real + " + i"
                           + C3.imaginary); 
    }
    } 
} 