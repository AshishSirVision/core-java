 package oops.polymorphism;
class Animal
{
    void eat()
     {
         System.out.println("eating..");
     }
}
 class dog extends Animal
 {
     void eat()
     {
         System.out.println("eating bread..");
     }
 }
 class cat extends Animal
 {
     void eat()
     {
         System.out.println("eating rat..");
     }
 }
 class lion extends Animal
 {
     void eat()
     {
         System.out.println("eating meat..");
     }
 }

public class TestPolymorphism3 {
    public static void main(String[] args) {
        Animal a;
        a=new dog();
        a.eat();
        a=new cat();
        a.eat();
        a=new lion();
        a.eat();
                
    }
 
}
