//proving this keyword
 
package oops.constructor;

public class A5 {
    void m()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        A5 obj=new A5();
        System.out.println(obj);
        obj.m();
    }
}
