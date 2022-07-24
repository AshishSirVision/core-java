package oops.aggregation;

public class Circle {
    
    Operation ob;//aggregation                // refereence variable
    float pi=3.14f;
    float area(int r)
    {
        ob=new Operation();//assign object to the reference variable
        return pi*ob.square(r);
    }
    public static void main(String[] args) {
        Circle obj=new Circle();
        System.out.println( obj.area(5));
    }
}
