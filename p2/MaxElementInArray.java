
package p2;
public class MaxElementInArray {
   public static void main(String[] args)
   {
       int marks[]={1,22,3,4,54,6,7};
       int max,i;
       max=marks[0];
       for(i=0;i<7;i++)
           if(marks[i]>max)
           {
               max=marks[i];
                 }
       System.out.println("max="+max);
   }
          
       
}
