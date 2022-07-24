package oops;
class Person
{
    private int id;
    private String name;
    private int age;
    private float fees;
   private int marks;

   public void set(int id, String name, int age, float fees, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fees = fees;
        this.marks = marks;
    }

    void display() {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("fees="+fees);
        System.out.println("marks="+marks);
    
     }
}
class Student3
{
    private int id;
    private String name;
    private int age;
    private float fees;
   private int marks;

   public Student3(int id, String name, int age, float fees, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fees = fees;
        this.marks = marks;
    }

    void display() {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("fees="+fees);
        System.out.println("marks="+marks);
    
     }
}

public class P4 {
    public static void main(String[] args) {
        
        Student3 tom=new Student3(111,"tom",243,453.64f,54);
       tom.display();
        Student3 jerry=new Student3(112,"jerry",24,5345.64f,4);
      jerry.display();
         Student3 kale=new Student3(113,"kale",43,3453.64f,5);
       kale.display();
         Student3 jack=new Student3(114,"jack",243,5345.64f,54);
       jack.display();
         Student3 jill=new Student3(115,"jill",24,453.64f,54);
       jill.display();
         Student3 kim=new Student3(116,"kim",43,5345.64f,4);
       kim.display(); 
       Student3 paul=new Student3(117,"paul",24,56.64f,5);
       paul.display();
       
       Person p1=new Person();
       p1.set(111, "anubhav", 12, 7887.6f, 87);
       p1.display();
       
    }
}
