package exception_handling;
public class TryCatch3 {
    public static void main(String[] args) {
        System.out.println("inside main method");
        int a[]={32,10};
     
        int c;
        
        try
        {
        c=(a[0]/a[1]);
        System.out.println("value of c is : "+c);
        }
        
        catch(ArithmeticException ex)
        {
             System.out.println("division by zero not possible");
        }
         catch(ArrayIndexOutOfBoundsException ex)
        {
             System.out.println("array index out of range ");
        }
        
        System.out.println("end of main method");
    }
  
}
