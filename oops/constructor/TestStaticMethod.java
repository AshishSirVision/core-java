//use of static method
 
package oops.constructor;

 class Student1{
      int rollno;
    String name;
    static String college="ITS";
    static void change()
    {
        college="BBDIT";
    }

Student1(int r,String n)
{ 
rollno=r;
name=n ;       
}
void display()
{
    System.out.println(rollno+""+name+""+college);
}
}

public class TestStaticMethod
{
public static void main(String[] args) {
    Student1.change();
     Student1 s1=new Student1(111,"kalyan");
      Student1 s2=new Student1(112,"aryan");
      Student1 s3=new Student1(113,"sonoo");
      s1.display();
      s2.display();
      s3.display();
    }
}

