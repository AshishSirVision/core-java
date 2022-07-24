
package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FILeDemo {
    public static void main(String[] args) {
        
        try {
            //byte oriented
            FileOutputStream fos=new FileOutputStream("demofile.txt");
             System.out.println("file open");
             fos.write("hello".getBytes());
            fos.write("world".getBytes());
            fos.write(" lets start programming".getBytes());
            
           FileOutputStream fos1=new FileOutputStream("demfile.txt");
             System.out.println("file open");
             fos1.write("mayuri".getBytes()); 
            
        }
        
        catch (FileNotFoundException ex) {
            System.out.println("file not found  "+ex);
        } catch (IOException ex) {
            System.out.println("io exception");
                 
        }
        
    }
}
