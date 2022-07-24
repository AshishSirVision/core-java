
package oops;
//Overriding--run time polymorphism
   //same method name same parameters
               //re-defined in child class
class Polygon
{
    void calculate()
    {
        System.out.println("add all cordinates");
    }
}
class Circle extends Polygon
{
    @Override
    void calculate()
    {
        super.calculate();
        System.out.println("Pi*r*r");
    }
}




public class P7Overriding {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.calculate();
    }
}
