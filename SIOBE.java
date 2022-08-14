
public class SIOBE {
    public static void main(String[] args) {
         System.out.println("Start program");
        String s="CORE JAVA";
        try
        {
            System.out.println(s.charAt(10));
        }
        catch(java.lang.StringIndexOutOfBoundsException ex)
        {
            System.out.println("string index out of range  :"+ex);
        }
        finally
        {
            System.out.println("always executed this line");
        }
        
        System.out.println("finish  program");
    }
}

