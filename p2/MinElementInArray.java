
package p2;
public class MinElementInArray {
   public static void main(String[] args)
           
   {
       int marks[]={19,24,34,45,8,66,79};
               int min,i;
               min=marks[0];
               for(i=0;i<7;i++)
                   if (marks[i]<min)
                       
                   {
                       min=marks[i];
                   }
               System.out.println("min="+min);
               
   }
}
