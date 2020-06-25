/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurcivefunction;

/**
 *
 * @author Admin
 */
public class Recurcivefunction {

    { 
static int rev (int n, int temp) 
{ 
    // base case 
    if (n == 0) 
        return temp; 
    
    temp = (temp * 10) + (n % 10); 
  
    return rev(n / 10, temp); 
} 
  
    public static void main(String[] args) 
        // TODO code application logic here
   { 
    int n = 1451; 
    int temp = rev(n, 0); 
      
    if (temp == n) 
        System.out.println("true"); 
    else
        System.out.println("false" ); 
} 
}