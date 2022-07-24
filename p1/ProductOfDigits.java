//
package p1;
///WRONG HAI
public class ProductOfDigits {
   public static void main(String[] args)
  {
      int num=123;
      int rem=0;
              int product=1;
                       while(num>0)
      {
          rem=num%10;
           product= product*rem;
      }
               
     System.out.println("rem="+ rem+"product="+ product+"num="+num);
   }
}
//
//           
//           
//           
//           
//       
//           
//     
//
