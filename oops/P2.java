package oops;

class Student1
{
    private int id;
    private String name;
    private int age;
    private float fees;
   private int marks;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
    
    public float getFees() {
        return fees;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
    
    }

public class P2 {
    public static void main(String[] args) {
        
        Student1 tom=new Student1();
        tom.setId(27);
        System.out.println(tom.getId());
        System.out.println(tom.getName());
        System.out.println(tom.getAge());
        System.out.println(tom.getFees());
        System.out.println(tom.getMarks());
       
        Student1 j=new Student1();
        j.setId(26);
        j.setName("Jerry");
        j.setAge(23);
        j.setFees(3553.56f);
        j.setMarks(45);
        
        System.out.println(j.getId());
        System.out.println(j.getName());
        System.out.println(j.getAge());
        System.out.println(j.getFees());
        System.out.println(j.getMarks());
         
        Student1 k=new Student1();
        k.setId(26);
        k.setName("kale");
        k.setAge(23);
        k.setFees(3553.56f);
        k.setMarks(45);
        
        System.out.println(k.getId());
        System.out.println(k.getName());
        System.out.println(k.getAge());
        System.out.println(k.getFees());
        System.out.println(k.getMarks());
        
        Student1 jack=new Student1();
        System.out.println(jack.getId());
        System.out.println(jack.getName());
        System.out.println(jack.getAge());
        System.out.println(jack.getFees());
        System.out.println(jack.getMarks());
        
    }
}
