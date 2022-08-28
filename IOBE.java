
public class IOBE {
    public static void main(String[] args) {
         System.out.println("Start program");
        int s[]={67,43,7,8,24};
        
        
        try
        {
            System.out.println(s[10]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("index out of range  :"+ex);
        }
        finally
        {
            System.out.println("always executed this line");
        }
        
        System.out.println("finish  program");
    }
}

