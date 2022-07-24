package oops.Abstraction;

 interface  Bike
{
    final int A=34;
   public abstract void run();
//    static void  run1(){}

//    public Bike() {
//    }
    
}

public class Honda implements Bike
{
   
public void run()
{
    System.out.println("running safely");
}
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
    }
}
