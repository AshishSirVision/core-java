package oops.overloading;

public class Adder2 {
  
     static long add(int a,long b)
    {
        return a+b;
    }
       static long add(long a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args) {
    //    System.out.println(Adder2.add(11,11);
        System.out.println(Adder2.add(12.5,13.6));
    }
}
