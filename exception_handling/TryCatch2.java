package exception_handling;
public class TryCatch2 {
    public static void main(String[] args) {
        System.out.println("inside main method");
        int a=32;
        int b=0;
        
        int c;
        
        try
        {
        c=a/b;
        System.out.println("value of c is : "+c);
        }
        catch(ArithmeticException ex)
        {
             System.out.println("division by zero not possible");
        }
        
        System.out.println("end of main method");
    }
  
}
