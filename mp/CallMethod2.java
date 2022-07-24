package mp;

import java.util.logging.Level;
import java.util.logging.Logger;

class Resources1
{
void PrintTable(int n)
{
    for (int i = 0; i <= 10; i++) 
    {
        System.out.println(n + " * " + i + " = " + (n*i)); 
    
    try {
        Thread.sleep(2000);
    } catch (InterruptedException ex) {
        
    }
    }
    
}     
}

class Task11
        {
    Resources1 obj=new Resources1();
     void runMeth()
     {
         obj.PrintTable(3);
     }
}

class Task21
        {
     Resources1 obj=new Resources1();
     void runMeth()
     {
      obj.PrintTable(4);
     }
}
class Task31
        {
     Resources1 obj=new Resources1();
     void runMeth()
     {
         obj.PrintTable(5);
}
}
public class CallMethod2 {
    public static void main(String[] args) {
      Task11 obj11=new Task11();
     Task21 obj21=new Task21();
     Task31 obj31=new Task31();
     obj11.runMeth();
     obj21.runMeth();
     obj31.runMeth();
    }
}

