
public class MultipleCatch {
    public static void main(String[] args) {
        try
        {
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Arithmetic excep :"+obj);
        }
        catch(Exception obj)
        {
            System.out.println(" excep :"+obj);
        }
        
    }
}
