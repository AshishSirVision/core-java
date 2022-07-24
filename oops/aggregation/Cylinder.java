
package oops.aggregation;


public class Cylinder {
  
    
    Operation ob;//aggregation                // refereence variable
    float pi=3.14f;
   int h=8;
    float area(int r)
    {
        ob=new Operation();//assign object to the reference variable
        return (h*pi*ob.square(r));
    }
    public static void main(String[] args) {
        Cylinder obj=new Cylinder();
        System.out.println( obj.area(5));
    }
} 

