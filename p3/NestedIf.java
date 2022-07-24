package p3;
public class NestedIf {
    public static void main(String[] args) {
        int sub1=45;
        int sub2=56;
        int sub3=67;
        int sub4=78;
        
        if (sub1>35) 
        {
            System.out.println("you are passed in sub 1");
             if (sub2>35)
             {
                 System.out.println("you are passed in sub 2");
                  if (sub3>35) 
                  {
                     System.out.println("you are passed in sub 3");
                      if (sub4>35)
                      {
                         System.out.println("you are passed in sub 4");
                          System.out.println("you are paased in  all sub");
                        }
                   }
             }
             
        }
    }
}
