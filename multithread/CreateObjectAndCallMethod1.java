package multithread;
class Resourse1
{
     void  printTable(int n)
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+(2*i));
        }
    }
}
class Task11
{
    
}
class Task21
{
    
}
class Task31
{
    
}

public class CreateObjectAndCallMethod1{
    public static void main(String[] args) {
       Resourse obj=new Resourse();
      obj.printTable(5);
    }
}
