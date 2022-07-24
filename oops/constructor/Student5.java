//  constructor overloading

package oops.constructor;

public class Student5 {
    int id;
    String name;
    int age;
    float fees;
    Student5(int i,String n,float f)
    {
    id=i;
    name=n;
    fees=f;
    }
    Student5(int i,String n,int a,float f)
    {
        id=i;
        name=n;
        age=a;
        fees=f;
    }
    void display()
    {
        System.out.println(id+""+name+""+age+", "+fees);
    }
    public static void main(String[] args) {
        Student5 s1=new Student5(111,"kalyan",235.5f);
        Student5 s2=new Student5(112,"aryan",56.78f);
        s1.display();
        s2.display();
    }
}
