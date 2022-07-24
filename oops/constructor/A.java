// this : to invoke current class method
 package oops.constructor;

public class A {
    void m()
    {
        System.out.println("hello m");
    }
    void n()
    {
        System.out.println("hello n");
        this.m();
    }
    
}
class TestThis4
{
    public static void main(String[] args) {
        A a=new A();
        a.n();
    }
}
