
package p1;
public class PalindromeNumber {
   public static void main(String[] args) {
        int num=25022022;
        int rem,rev=0;
        int temp=num;
        while(num!=0)
        {
        rem=num%10;
        rev=rem+(rev*10);
        num=num/10;
        System.out.println("rem = "+rem+" rev : "+rev+" num "+num);
        }
        if(rev==temp)
        {
            System.out.println(temp+" is palindrome number ");
        }
        else
        {
          System.out.println(temp+" is not palindrome number ");  
        }
         }  
}
