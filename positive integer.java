package positive.integer;

public class PositiveInteger {
static void printno(int n) 
    { 
        if (n < 0) 
            return; 
  
        else { 
            System.out.printf("%d ", n); 
  
            // Statement 2
            printno(n - 1); 
  
            System.out.printf("%d ", n); 
            return; 
        } 
    } 

    public static void main(String[] args) {
      int n = 5; 
        printno(n); 
    } 
} 
