
package p2;
public class NestedForLoop {
    public static void main(String[] args)
    {
        int temp;
          int marks[]={19,24,34,45,8,66,79};
          int len=marks.length;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j < (len-i-1); j++) {
                System.out.print(i+", "+j+"\t"); 
                 
            }
             System.out.println(); 
        }
     
        
    }
}