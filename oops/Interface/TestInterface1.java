package oops.Interface;

interface Drawable
{
    void Draw();
}
class Rectangle implements Drawable
{
    public void Draw()
    {
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Drawable
{
    public void Draw()
    {
        System.out.println("Drawing circle");
    }
}
public class TestInterface1 {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.Draw();
    }
}
