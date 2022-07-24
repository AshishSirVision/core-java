// this : to invoke current class constructor
 // calling default constructor from parameterized constructor
package oops.constructor;
 class A1 {
    A1()
    {
        System.out.println("hello a");
} 
    A1(int X)
    { 
        this();
        System.out.println(X);    
    }
}
class TestThis5
{
    public static void main(String[] args) {
        A1 a=new A1(10);
        
    }
}

