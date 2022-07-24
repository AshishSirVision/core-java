package mp;

class Resources3
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

class Task13 extends Thread
        {
    Resources3 r;
    Task13(Resources3 obj)
    {
        r=obj;
    }
    public void run()
     {
         r.PrintTable(3);
     }
}

class Task23 extends Thread
        {
     Resources3 r;
     Task23(Resources3 obj)
     {
       r=obj;  
     }
   public  void run()
     {
      r.PrintTable(4);
     }
}
class Task33 extends Thread
{
       Resources3 r;

    Task33(Resources3 obj)
    {
        r=obj;
    }
    public void run()
     {
         r.PrintTable(5);
     }
}


public class MultiThreading {
    public static void main(String[] args) {
        Resources3 obj = new Resources3();
      Task13 obj1=new Task13(obj);
     Task23 obj2=new Task23(obj);
     Task33 obj3=new Task33(obj);
     obj1.start();
     obj2.start();
     obj3.start();
    }
}

