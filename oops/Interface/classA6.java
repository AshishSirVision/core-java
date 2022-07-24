
package oops.Interface;

interface printable
{
    void print();
}
public class classA6 implements printable
{
   public  void  print()
   {
       System.out.println("Hello");
   }
    public static void main(String[] args) {
        classA6 obj=new classA6();
        obj.print();
    }
}
