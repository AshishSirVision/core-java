package oops.polymorphism;

class Animals
{
    void eat()
    {
        System.out.println("eating..");
    }
}
class Dogs extends Animals
{
    void eat()
    {
        System.out.println("eating fruits.."); 
    }
}

 class Babydog extends Dogs

{
    void eat()
    {
        System.out.println("drinking milk..");
    }

public static void main(String args[])
{
Animals a1,a2,a3;
a1=new Animals();
a2=new Dogs();
a3=new Babydog();
a1.eat();
a2.eat();
a3.eat();
   
}       
}
