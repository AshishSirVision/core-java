
public class AEDemo {
    public static void main(String[] args) {
         System.out.println("Start program");
        int a=12;
        int b=0;
        
        try
        {
             System.out.println(a/b);
             //when exception occur then redirect incatch block
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Division by Zero :"+ex);
        }
        finally
        {
            System.out.println("always executed this line");
        }
        
        System.out.println("finish  program");
    }
}
