
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WriteIntoFile {
    public static void main(String[] args) {
        FileOutputStream fobj;
        try {
            fobj = new FileOutputStream("demofile.txt");
            fobj.write(65);
            
            
        } 
        catch (FileNotFoundException ex) {//sub class
            System.out.println("file not found"+ex);
       
        } 
        catch (IOException ex) {//base class
            System.out.println("Input output excep"+ex);
        
        }
        
        
       
    }
    
}
