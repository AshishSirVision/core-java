package multithread;

class Resourse3
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
class Task13 extends Thread
{
     Resourse3 o;

    Task13(Resourse3 obj) {
        o=obj;
    }
     public void run()
     {
         o.printTable(5);
     }
}
class Task23 extends Thread
{
       Resourse3 o;

    Task23(Resourse3 obj) {
        o=obj;
    }
     public void run()
     {
         o.printTable(2);
     }
}
class Task33 extends Thread
{
      Resourse3 o;

    Task33(Resourse3 obj) {
        o=obj;
    }
     public void run()
     {
         o.printTable(4);
     }
}

public class UsingMultiThreading {
    public static void main(String[] args) {
       Resourse3 obj=new Resourse3();
     Task13 obj1=new Task13(obj);
     Task23 obj2=new Task23(obj);
     Task33 obj3=new Task33(obj);
     obj1.start();
     obj2.start();
     obj3.start();
     
    }
}
