// downcasting with instanceof
package oops.InstanceOf;

class Animal
{
    
}

public class Dog3 extends Animal {
    static void method(Animal a)
    {
        if(a instanceof Dog3)
        {
            Dog3 d=(Dog3)a;
            System.out.println("ok downcasting performed");
        }
    }
    public static void main(String[] args) {
        Animal a=new Dog3();
        Dog3.method(a);
    }
}
