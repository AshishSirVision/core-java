
public class NFE {
    public static void main(String[] args) {
         System.out.println("Start program");
        String s="r";
        int b=2;
        
        try
        {
            int a=Integer.parseInt(s);
             System.out.println(a/b);
             //when exception occur then redirect incatch block
        }
        catch(NumberFormatException ex)
        {
            System.out.println("cannot convert charcter into integer :"+ex);
        }
        finally
        {
            System.out.println("always executed this line");
        }
        
        System.out.println("finish  program");
    }
}

