
public class FinallyBlock {
    public static void main(String[] args) {
         System.out.println("Start program");
        int a=12;
        int b=10;
        
        try
        {
             System.out.println(a/b);
             //when exception occur then redirect incatch block
        }
        finally
        {
            System.out.println("always executed when exception occur or not");
        }
        
        System.out.println("finish  program");
    }
}
