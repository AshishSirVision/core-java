package recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int add=sum(num);
        System.out.println(add);
        
    }
    
    
   static int  sum(int n)
    {
        if(n==0)
            return n;
        else
            return n+sum(n-1);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          