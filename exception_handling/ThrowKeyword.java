
package exception_handling;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("inside main method");
      try
        {
        throw new ArithmeticException();
       
        }
        catch(ArithmeticException ex)
        {
             System.out.println("division by zero not possible");
        }
        
        System.out.println("end of main method");
    
    }
 
}
