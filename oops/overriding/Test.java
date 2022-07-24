package oops.overriding;
class Bank
{
   int getRateOfInterest()
           {
               return 0;
           } 
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class ICICI extends Bank
{
    int getRateOfInterst()
    {
        return 7;
    }
}
class AXIS extends Bank
{
    int getRateOfInterst()
    {
        return 9;
    }
}

public class Test {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of interesr"+s.getRateOfInterest());
        System.out.println("ICICI Rate of interest"+i.getRateOfInterst());
        System.out.println("AXIX Rate of interest"+a.getRateOfInterst());
    }
}
