// initialize blank final variable in constructor
package oops.Finalkeyword;

public class Bike10 {

    final int speedlimit;      //blank final variable 

    Bike10() {
        speedlimit = 70;
        //speedlimit = 701;//re-assignment not possible
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        new Bike10();
    }
}
