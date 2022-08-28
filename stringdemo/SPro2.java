/*
There are many ways to reverse String in Java. 
We can reverse String using StringBuffer, StringBuilder, iteration etc. 
Let's see the ways to reverse String in Java.
1) By StringBuilder / StringBuffer
 */
package stringdemo;

public class SPro2 {

    public static String reverseString(String str) {
        char []ch=str.toCharArray();
        String rev="";
        for (int i = ch.length-1; i >=0; i--) {
           rev+=ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(SPro2.reverseString("tom and jerry"));
    }
}
