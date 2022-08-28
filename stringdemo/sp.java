
package stringdemo;
class sp1
{
public static boolean spal(String str)
{
StringBuffer sb=new StringBuffer(str);
sb.reverse();
String rev=sb.toString();
if(rev.equals(str))
{
return true;
}
else
{
return false;
}
}
}
public class sp {
 public static void main(String[] args)
 {
     String s="tom";
     s=s.concat("e");
     System.out.println(s);
 System.out.println(sp1.spal("abcba"));
 }
}
