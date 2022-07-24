
package p1;
public class ReverseOfDigits {
   public static void main(String[] args) {
        int num=123424;
        int rem,rev=0;
        while(num!=0)
        {
        rem=num%10;
        rev=rem+(rev*10);
        num=num/10;
        System.out.println("rem = "+rem+" rev : "+rev+" num "+num);
        }
    }  
}
