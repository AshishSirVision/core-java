//this can be used to return current class instance
 
package oops.constructor;

class B1
{
    B1 getB1()
    {
        return this;
    }
    void msg()
    {
        System.out.println("hello java");
    }
}

class Testob {
    public static void main(String[] args) {
        new B1().getB1().msg();
    }
}
