
package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
     public static void main(String[] args) {
        try {
            FileReader fos=new FileReader("demofile.txt");
           
            int i;
            while ((i=fos.read())!=-1) 
            {                
                System.out.print((char)i);
            }
            fos.close();
            } 
        catch (FileNotFoundException ex) {
          
        } catch (IOException ex) {
         
        }
        
    }
}
