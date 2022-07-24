package oops;

class Student2
{
    private int id;
    private String name;
    private int age;
    private float fees;
   private int marks;

    public void setId(int id) {
        this.id = id;
    }

 public void setName(String name) {
        this.name = name;
    }
 
 public void setAge(int age) {
        this.age = age;
    }

 public void setFees(float fees) {
        this.fees = fees;
    }
    
 public void setMarks(int marks) {
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

