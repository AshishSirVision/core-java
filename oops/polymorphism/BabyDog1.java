
package oops.polymorphism;

class Animal1
{
   void eat()
   {
       System.out.println("Animal is eating..");
   }
}
class Dog1 extends Animal1
{
    void eat()
    {
        System.out.println(" dog is eating");
    }
}

public class BabyDog1 extends Dog1{
    public static void main(String[] args) {
        Animal1 a=new BabyDog1();
        a.eat();
    }
 
}
