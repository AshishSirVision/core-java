package syncronization.ssync;

class Resourse3
{
    synchronized static void  printTable(int n)
    {
       
           for (int i = 0; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
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
    
     public void run()
     {
       Resourse3.printTable(5);
     }
}
class Task23 extends Thread
{
     
     public void run()
     {
       Resourse3.printTable(2);
     }
}
class Task33 extends Thread
{
      
     public void run()
     {
       Resourse3.printTable(4);
     }
}

public class SyncronizationStatic {
    public static void main(String[] args) {
       Resourse3 obj=new Resourse3();
     Task13 obj1=new Task13();
     Task23 obj2=new Task23();
     Task33 obj3=new Task33();
     obj1.start();
     obj2.start();
     obj3.start();
     
    }
}
