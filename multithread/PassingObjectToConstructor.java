package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

class Resourse2
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
class Task12
{
     Resourse2 o;

    Task12(Resourse2 obj) {
        o=obj;
    }
     void runMeth()
     {
         o.printTable(5);
     }
}
class Task22
{
       Resourse2 o;

    Task22(Resourse2 obj) {
        o=obj;
    }
     void runMeth()
     {
         o.printTable(2);
     }
}
class Task32
{
      Resourse2 o;

    Task32(Resourse2 obj) {
        o=obj;
    }
     void runMeth()
     {
         o.printTable(4);
     }
}

public class PassingObjectToConstructor {
    public static void main(String[] args) {
       Resourse2 obj=new Resourse2();
     Task12 obj1=new Task12(obj);
     Task22 obj2=new Task22(obj);
     Task32 obj3=new Task32(obj);
     obj1.runMeth();
     obj2.runMeth();
     obj3.runMeth();
     
    }
}
