package mp;

class Resources2
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

class Task111
        {
    Resources2 r;
    Task111(Resources2 obj)
    {
        r=obj;
    }
     void runMeth()
     {
         r.PrintTable(3);
     }
}

class Task211
        {
     Resources2 r;
     Task211(Resources2 obj)
     {
       r=obj;  
     }
     void runMeth()
     {
      r.PrintTable(4);
     }
}
class Task311
{
       Resources2 r;

    Task311(Resources2 obj)
    {
        r=obj;
    }
     void runMeth()
     {
         r.PrintTable(5);
     }
}


public class ConstructorPassing {
    public static void main(String[] args) {
        Resources2 obj = new Resources2();
      Task111 obj1=new Task111(obj);
     Task211 obj2=new Task211(obj);
     Task311 obj3=new Task311(obj);
     obj1.runMeth();
     obj2.runMeth();
     obj3.runMeth();
    }
}

