package recursion;
public class Recursion3 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
          int add=fibonacci(i);
           System.out.println(add);
        }
    }
  static int  fibonacci(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
