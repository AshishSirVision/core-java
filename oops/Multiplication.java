package oops;
class Multiply
{
   Multiply()
    {
        System.out.println("no input");
    }
   Multiply(int a)
    {
        System.out.println("one input");
    }
   Multiply(float a)
    {
        System.out.println("one f1 input");
    }
}
public class Multiplication {
    public static void main(String[] args) {
       Multiply obj=new Multiply();
       new Multiply(234);
       new Multiply(456.7f);
    }
    
}
