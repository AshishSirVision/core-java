package oops.aggregation;

public class Cone {
    
     Operation ob;       //aggregation                // refereence variable
    float pi=3.14f;
   int h=8;
    float area(int r)
    {
        ob=new Operation();      //assign object to the reference variable
        return (((float)1/3)*h*pi*ob.square(r));
    }
    
    public static void main(String[] args) {
        Cone obj=new Cone();
        System.out.println( obj.area(5));
    }
}

