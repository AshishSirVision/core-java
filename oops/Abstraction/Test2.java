//Abstract class having constructor,data member ,methods

package oops.Abstraction;

abstract class Bike2
{
    Bike2()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changegear()
            {
                System.out.println("gear is changed");  
            }
       }
class Honda2 extends Bike2
{
    void run()
    {
        System.out.println("running safely");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Bike2 obj=new Honda2();
        obj.run();
        obj.changegear();
    }
 }
