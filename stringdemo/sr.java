
package stringdemo;
class S
{
public static void srev(String str)
{
StringBuilder st1=new StringBuilder(str);
st1.reverse();
System.out.println(st1.toString());
}
}

public class sr {
  public static void main(String[] args)
  {
  new S();
  S.srev("Hello World");
  }
}
