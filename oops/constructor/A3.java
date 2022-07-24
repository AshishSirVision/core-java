// calling parameterized constructor from default constructor 
 
package oops.constructor;

public class A3 {
     A3()
    {
         this(5);
        System.out.println("hello a");
} 
    A3(int X)
    { 
       
        System.out.println(X);    
    }
}
class TestThis6
{
    public static void main(String[] args) {
        A3 a=new A3();
        
    }
}

