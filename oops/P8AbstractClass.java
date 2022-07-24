package oops;

abstract class RBI//object can't be created
{
    abstract void rateOfInterest();// abstract method cannot create block 
}
class SBI extends RBI
{
    void rateOfInterest()
    {
        System.out.println("roi 8.0");
    }
}

public class P8AbstractClass {
    public static void main(String[] args) {
        
        RBI nina=new SBI();
        nina.rateOfInterest();
        
        
        
    }
}
