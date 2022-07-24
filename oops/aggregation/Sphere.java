
package oops.aggregation;
public class Sphere {
    
    Operation ob;//aggregation                // refereence variable
    float pi=3.14f;
    float area(int r)
    {
        ob=new Operation();//assign object to the reference variable
        return (4/3)*pi*ob.cube(r);
    }
    public static void main(String[] args) {
        Sphere obj=new Sphere();
        System.out.println( obj.area(5));
    }
}
