
package stringdemo;

public class StringBufferDemo {
  public static void main(String[] args) {
     
        StringBuffer s1=new StringBuffer("tom");
        StringBuffer s2=new StringBuffer("jerry");
    //   System.out.println(s1+s2);
         System.out.println(s1.append(s2));
         System.out.println(s1);
          System.out.println(s2);
       
        System.out.println();
    }  
}
