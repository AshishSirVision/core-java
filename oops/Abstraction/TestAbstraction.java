package oops.Abstraction;

abstract class shape
{
    abstract void draw();
}
class rectangle extends shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class circle extends shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
       shape s=new circle();
       s.draw();
    }
  
}
