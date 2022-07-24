package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
      public static void main(String[] args) {
        
        try {
            //character oriented data write
            FileWriter fos=new FileWriter("demofile1.txt");
             System.out.println("file open");
             fos.write("hello");
            fos.write("world");
            fos.write(" lets start programming");
            
         fos.close();
        }
       
        catch(FileNotFoundException ex)
        {
            System.out.println("file not available : "+ex); 
        }
         catch(IOException ex)
        {
            System.out.println("input output exception :"+ex);
        }
}
}
