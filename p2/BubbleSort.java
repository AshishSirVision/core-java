package p2;
public class BubbleSort {
    public static void main(String[] args)
    {
        int temp;
          int marks[]={19,24,34,45,8,66,79};
          int len=marks.length;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j < (len-i-1); j++) {
                if (marks[j]>marks[j+1]) {
                    temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
        System.out.print(marks[i]+", ");
    }
         }
}