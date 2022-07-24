package exception_handling;
public class NestedTry {
    public static void main(String[] args) {
          System.out.println("inside main method");
        int a=32;
        int b=0;
        int c[]=new int[0];
        
        try
        {
         
          try
          {
               c[0]=a/b;
          System.out.println("value of c is : "+c);
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println("index not found : "+e);
          }
        }
        catch(ArithmeticException ex)
        {
             System.out.println("division by zero not possible "+ex);
        }
        
        System.out.println("end of main method");
    }
}
