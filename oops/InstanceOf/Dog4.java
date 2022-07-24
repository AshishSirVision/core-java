//downcating without instance of

package oops.InstanceOf;

    class Animals
{
    
}

public class Dog4 extends Animals {
    static void method(Animals a)
    
        
        {
            Dog4 d=(Dog4)a;
            System.out.println("ok downcasting performed");
        }
    

    public static void main(String[] args)
{
        Animals a=new Dog4();
        Dog4.method(a);
    }
}

