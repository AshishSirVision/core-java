

import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
     
     String fname="Ashish";
     String mname="M";
     
     char lname[]={'y','a','d','a','v'};
        System.out.println(fname);
        System.out.println(fname.toUpperCase());
        System.out.println(fname.toLowerCase());
        System.out.println(fname.charAt(1));
        System.out.println(fname.indexOf('i'));
        System.out.println(fname.indexOf('s'));
        System.out.println(fname.lastIndexOf('s'));
        System.out.println(fname.concat(Arrays.toString(lname)));
        System.out.println(fname.concat(mname));
        byte b[]=fname.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char)b[i]);
        }
        System.out.println("");
        char c[]=fname.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        
        
        
        
        
    }
}
