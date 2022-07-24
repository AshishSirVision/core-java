package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fos=new FileInputStream("demofile.txt");
             FileInputStream fos1=new FileInputStream("ws.txt");
             
           // System.out.println(fos.read());
             
            System.out.print((char)fos.read());
            int i;
            while ((i=fos.read())!=-1) 
            {                
                System.out.print((char)i);
            }
            fos.close();
            
            System.out.println();
           
           int j;
            while ((j=fos1.read())!=-1)
            {                
                System.out.print((char)j);
            }
            fos1.close();
            
             } catch (FileNotFoundException ex) {
          
        } catch (IOException ex) {
         
        }
        
    }
}
