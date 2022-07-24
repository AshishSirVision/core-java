// real use of instanceof
package oops.InstanceOf;
interface Printable
{
    
}
class A implements Printable
{
public void a()
{
    System.out.println("a method");
}
}
class B implements Printable
{
    public void b()
    {
        System.out.println("b method");
    }
}
class call
{
    void invoke(Printable p)
    {
        if(p instanceof A)
        {
            A a=(A)p;
            a.a();
        }
if(p instanceof B)
{
    B b=(B)p;
    b.b();
}
    }
}
public class Test {
    public static void main(String[] args) {
        Printable p=new B();
        call c=new call();
        c.invoke(p);
    }
}
