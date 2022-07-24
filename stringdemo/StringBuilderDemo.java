
package stringdemo;
public class StringBuilderDemo {
    public static void main(String[] args) {
     
        StringBuilder s1=new StringBuilder("tom");
        StringBuilder s2=new StringBuilder("jerry");
      
         System.out.println(s1.append(s2));
         System.out.println(s1);
          System.out.println(s2);
       
        System.out.println();
    }  
}
