
public class WithExceptionHandling {
    public static void main(String[] args) {
         System.out.println("Start program");
        int a=12;
        int b=10;
        
        try
        {
             System.out.println(a/b);
             //when exception occur then redirect incatch block
        }
        catch(Exception ex)
        {
            System.out.println("Division by Zero :"+ex);
        }
        
        System.out.println("finish  program");
    }
}
