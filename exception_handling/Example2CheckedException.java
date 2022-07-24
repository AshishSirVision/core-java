package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example2CheckedException {
    public static void main(String[] args) {
        
        try {
            FileInputStream obj=new FileInputStream("demofile2.txt");
             System.out.println(obj.read());
             System.out.println("ok");
        } catch (FileNotFoundException ex) {
             System.out.println("file not found"+ex);
        } catch (IOException ex) {
            System.out.println("input output exception"+ex);
        }
       
    }
}
