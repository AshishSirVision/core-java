package p2;
public class Array2DD {
  public static void main(String[] args)
          
  {
         int[][] m3=new int[5][5];
  int m1[][]={
      {12,23,87,56,75},
      {45,67,23,56,76},
      {12,93,23,87,88},
      {48,67,43,23,12},
      {48,67,74,34,23}
};
   int m2[][]={
       {12,23,89,76,54},
       {45,67,98,43,21},
       {12,93,23,87,88},
       {48,67,43,23,12},
       {48,67,74,34,23}
   };
      for (int row = 0; row < 5; row++) {
          for (int i = 0; i <5 ; i++) {
            System.out.print(m1[row][i]+"\t ");
       }
       System.out.println(" ");
       }   
          
      for (int row = 0; row < 5; row++) {
          for (int i = 0; i <5; i++) {
            System.out.print(m2[row][i]+"\t ");
       }
       System.out.println(" ");
       }  
      
      
         for (int row = 0; row < 5; row++) {
          for (int i = 0; i <5 ; i++) {
            m3[row][i]= m1[row][i]+ m2[row][i];
       }
       }
         
         
         for (int row = 0; row < 5; row++) {
          for (int i = 0; i <5; i++) {
            System.out.print(m3[row][i]+"\t ");
       }
       System.out.println(" ");
       }  
      
      
         
       System.out.println(" ");
       }
  }

      
