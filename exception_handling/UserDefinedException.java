
package exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;


public class UserDefinedException {
    public static void main(String[] args) {
          System.out.println("inside main method");
      try
        {
        throw new InsufficientBalannceException();
       
        }
         catch (InsufficientBalannceException ex) {
             System.out.println("balance not sufficient :"+ex);
        }
        
        System.out.println("end of main method");
    }
}
