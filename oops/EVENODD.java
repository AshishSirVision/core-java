package oops;

import java.util.Scanner;

public class EVENODD {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        findEvenOdd(num);
       findEvenOdd(45);
       findEvenOdd(76);
       findEvenOdd(7);
        
        System.out.println(add(5,6));
        int r=add(4,9);
        
        System.out.println(r);
             System.out.println(areaOfcircle(45));    
      
             
             EVENODD obj=new EVENODD();
             int ans=obj.product(6, 5);
               System.out.println(ans);
      
    }
    
     public static void findEvenOdd( int num)
    {
      if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else
        {
            System.out.println(num+" is odd number");
        }
    
    }
    public 
            
    static int add(int a,int b)
    { 
        int c=a+b;
        return c;
    }
     public  int product(int a,int b)
    { 
        int c=a*b;
        return c;
    }
        public static float areaOfcircle(int r)
    { 
        float c=3.14f*r*r;
        return c;
    }     
}
