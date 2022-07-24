package exception_handling;
public class TryCatch4 {
    public static void main(String[] args) {
    
     
        String s=null;
        
        try
        {
            int c=s.length();
        System.out.println("value of c is : "+c);
        }
        
        catch(ArithmeticException ex)
        {
             System.out.println("division bu=y zero not possible");
        }
         catch(ArrayIndexOutOfBoundsException ex)
        {
             System.out.println("array index out of range ");
        }
            catch(NullPointerException ex)
        {
             System.out.println("cannot find length of null ");
        }
        System.out.println("end of main method");
    }
  
}
