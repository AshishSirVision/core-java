package exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleCheckedException {
    public static void main(String[] args) {
        try {
            Class.forName("p1.WhileLoop");
             System.out.println("ok");
        } catch (ClassNotFoundException ex) {
             System.out.println("class not found");
        }
       
    }
}
