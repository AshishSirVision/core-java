//to find out cube of the given number using static method

package oops.constructor;

public class Calculate {
    static int cube(int X)
    {
        return X*X*X;
    }
    public static void main(String[] args) {
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
