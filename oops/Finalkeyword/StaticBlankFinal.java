package oops.Finalkeyword;

public class StaticBlankFinal {

    static final int data;    //static blank final variable 

    static {
        data = 50;
    }

    public static void main(String args[]) {
        System.out.println(StaticBlankFinal.data);
    }
}
