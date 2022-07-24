
package exception_handling;


public class CustomMsgException {
      public static void main(String[] args) {
          System.out.println("inside main method");
      try
        {
        throw new InsufficientBalannceException1(" amount less");
       
        }
         catch (InsufficientBalannceException1 ex) {
             System.out.println("balance not sufficient :"+ex);
        }
       try
        {
        throw new EligibleToVoteException(" not eligible");
       
        }
         catch ( EligibleToVoteException ex) {
             System.out.println("eligible to vote :"+ex);
        }
        
        System.out.println("end of main method");
    }
}
