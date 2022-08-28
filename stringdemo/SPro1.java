/*
There are many ways to reverse String in Java. 
We can reverse String using StringBuffer, StringBuilder, iteration etc. 
Let's see the ways to reverse String in Java.
1) By StringBuilder / StringBuffer
 */
package stringdemo;

public class SPro1 {

    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(SPro1.reverseString("tom and jerry"));
    }
}
