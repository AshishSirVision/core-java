// program of the counter without static variable
 
package oops.constructor;

public class Counter {
    int count=0;
    Counter()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
