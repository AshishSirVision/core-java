package oops.inheritance;
class Animal2
{
void eat()
{
    System.out.println("eating...");  
}
}
class Dog2 extends Animal2
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class Cat extends Animal2
{
    void meow()
    {
        System.out.println("meowing...");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
              c.eat();
              
      Dog2 d=new Dog2();        
    d.bark();
    
  
    }
}
