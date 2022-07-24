package p2;
public class RelationalOperator {
   public static void main(String[] args)
   {
       int a=10;
       int b=10;
       boolean conl;
      conl=a>b;
     System.out.println(a+"is greater than"+b+"="+conl);
      conl=a<b;
     System.out.println(a+"is less than"+b+"="+conl);
      conl=a==b;
     System.out.println(a+"is equal to"+b+"="+conl);
      conl=a>=b;
     System.out.println(a+"is greater than equal to"+b+"="+conl);
      conl=(a<=b);
     System.out.println(a+"is less than equal to "+b+"="+(a<=b));
      conl=a!=b;
     System.out.println(a+"is not equal to"+b+"="+conl);
}
}
