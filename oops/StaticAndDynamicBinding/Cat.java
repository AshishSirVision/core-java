// dynamic binding

package oops.StaticAndDynamicBinding;
class Animal
{
    void eat()
    {
        System.out.println("animal is eating..");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("cat is eating..");
    }
public static void main(String args[])
{
Animal a=new Cat();
a.eat();
}   
}
