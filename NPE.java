
public class NPE {
    public static void main(String[] args) {
         System.out.println("Start program");
        String a=null;
       
        
        try
        {
             System.out.println(a.length());
             //when exception occur then redirect incatch block
        }
        catch(NullPointerException ex)
        {
            System.out.println("cannot find length of null value :"+ex);
        }
        finally
        {
            System.out.println("always executed this line");
        }
        
        System.out.println("finish  program");
    }
}
