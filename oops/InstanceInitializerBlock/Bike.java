
package oops.InstanceInitializerBlock;

class Bike
{
    int speed;
    Bike()
    {
        System.out.println("speed is"+speed);
    }
    {
        speed=100;
    }
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b2=new Bike();
    }
}

    

