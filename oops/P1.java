package oops;

class Student
{
    int id;
    String name;
    int age;
    float fees;
    int marks;
}

public class P1 {
    public static void main(String[] args) {
        
        Student tom=new Student();
        tom.id=27;
        System.out.println(tom.id);
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.fees);
        System.out.println(tom.marks);
       
        Student j=new Student();
        j.id=123;
        j.name="Jerry";
        j.age=23;
        j.fees=3553.56f;
        j.marks=45;
        
        System.out.println(j.id);
        System.out.println(j.name);
        System.out.println(j.age);
        System.out.println(j.fees);
        System.out.println(j.marks);
         
        Student k=new Student();
        k.id=456;
        k.name="Kale";
        k.age=27;
        k.fees=3000f;
        k.marks=50;
        
        System.out.println(k.id);
        System.out.println(k.name);
        System.out.println(k.age);
        System.out.println(k.fees);
        System.out.println(k.marks);
        
        Student jack=new Student();
        System.out.println(jack.id);
        System.out.println(jack.name);
        System.out.println(jack.age);
        System.out.println(jack.fees);
        System.out.println(jack.marks);
        
    }
}
