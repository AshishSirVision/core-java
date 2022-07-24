package p1;

import oops.aggregation.Operation;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=123424;
        int rem,product=1;
        while(num!=0)
        {
        rem=num%10;
        product=product*rem;
        num=num/10;
        System.out.println("rem = "+rem+" product : "+product+" num "+num);
        
        Operation obj=new Operation();
            System.out.println(obj.quadrant(5));
            
            
  
            System.out.println(new Operation().quadrant(5));
        }
    }
    
}
