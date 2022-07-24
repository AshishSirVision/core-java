package p2;
public class LogicalOperator {
   public static void main(String[]args)
   {
        int a=10;
           int b=20;
           int c=20;
           
           boolean con1,con2;
           boolean and,or,not;
           
           con1=b>c;
           con2=(b==c);
           
           System.out.println(""+con1);
           System.out.println(""+con2);
          
           and=con1 && con2;
            System.out.println("and : "+and);
                  
            or=con1 || con2;
            System.out.println("or : "+or);
            
            not=!true;
              System.out.println("not :"+ not);
            
              not=!(con1 && con2);
              System.out.println("not :"+ not);
              
              
              System.out.println(true && true);
              System.out.println(true && false);
              System.out.println(false && true);
              System.out.println(false && false);
            
               System.out.println(true || true);
              System.out.println(true|| false);
              System.out.println(false|| true);
              System.out.println(false|| false); 
              
              System.out.println(!false);
              System.out.println(!true);
              
              
        }
}
