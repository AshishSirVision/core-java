// use of static block
 
package oops.constructor;

public class A2 {
    static 
    {
        System.out.println("static block is invoked");
    }
    public static void main(String[] args) {
        System.out.println("hello main");
    }
}
