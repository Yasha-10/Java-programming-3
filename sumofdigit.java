/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_of_digit;

public class Sum_of_digit {
   static int sum_of_digit(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum_of_digit(n / 10)); 
    }

    public static void main(String[] args) 
        
    { 
        int num = 123; 
        int result = sum_of_digit(num); 
        System.out.println("Sum of digits in " +  
                           num + " is " + result); 
    } 
} 