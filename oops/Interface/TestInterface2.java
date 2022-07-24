package oops.Interface;
interface Goverment
{
    void message();
}
interface Bank extends Goverment{

    float RateOfInterest();
    void internationallevel();
    void nationallevel();
    
}

class partialImple implements Bank
{

    @Override
    public float RateOfInterest() {
        return 0;
    }

    @Override
    public void internationallevel() {
    }

    @Override
    public void nationallevel() {
   }

    @Override
    public void message() {
   }
    
}


class SBI extends partialImple {

    public float RateOfInterest() {
        return 9.15f;
    }

    @Override
    public void nationallevel() {
        System.out.println("nationallevel");//To change body of generated methods, choose Tools | Templates.
    }
    
}

class PNB extends partialImple {

    public float RateOfInterest() {
        return 7.5f;
    }

    @Override
    public void internationallevel() {
       System.out.println("internationallevel");//T
    }

    @Override
    public void message() {
   
        System.out.println("message");
    
    }
    
    
}

public class TestInterface2 {

    public static void main(String[] args) {

       SBI obj=new SBI();
        System.out.println(obj.RateOfInterest());
       obj.nationallevel();
       
       PNB obj2=new PNB();
        System.out.println(obj2.RateOfInterest());
       obj2.message();
       obj2.internationallevel();
       
    }
}
