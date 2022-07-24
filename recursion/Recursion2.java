package recursion;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int add=factorial(num); 
        System.out.println(add);
                
        
    }
    
    static int  factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
