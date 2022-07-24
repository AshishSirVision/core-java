package p1;
public class NestedForLoop1 {
    public static void main(String[] args) {
       // int m1[][]=new int[5][3];
        int m1[][]={
            {334,3434,54},
            {3544,3764,514},
            {314,34,54},
            {34,324,54},
            {324,34,54}
             };
         for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(i+","+j+" : "+m1[i][j]+"\t "); 
        }
       System.out.println();
        }
    }
}
