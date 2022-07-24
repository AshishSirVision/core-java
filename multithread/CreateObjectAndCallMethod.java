package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

class Resourse
{
     void  printTable(int n)
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+(2*i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("sleep method not work properly :"+ex);
            }
        }
    }
}
class Task1
{
     Resourse obj=new Resourse();
     void runMeth()
     {
         obj.printTable(5);
     }
}
class Task2
{
       Resourse obj=new Resourse();
        void runMeth()
     {
         obj.printTable(5);
     }
}
class Task3
{
      Resourse obj=new Resourse();
       void runMeth()
     {
         obj.printTable(5);
     }
}

public class CreateObjectAndCallMethod {
    public static void main(String[] args) {
      // Resourse obj=new Resourse();
     Task1 obj1=new Task1();
     Task2 obj2=new Task2();
     Task3 obj3=new Task3();
     obj1.runMeth();
     obj2.runMeth();
     obj3.runMeth();
     
    }
}
