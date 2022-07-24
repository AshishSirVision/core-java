/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
class Student2_v1
{
    //instance variable
   private int id;
    private String name;
    private int age;
    private float fees;
    private int marks;
    
    public void setId(int id)
    {
      this.id=id;   
    }
    
   public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
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



public class P2_V1 {
    public static void main(String[] args) {
        //create object of the class
        Student2_v1 s1=new Student2_v1();
        Student2_v1 s2=new Student2_v1();
        
        //using object give value to the instance variable
          //for s1
        s1.setId(111);
        s1.setName("Avinash");
            //for s2
        s2.setId(112);
        s2.setName("anjali");
        s2.setAge(22);
        s2.setFees(434.32f);
        s2.setMarks(98);
        
        //using object display the value of instace variable
        //for s1
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getFees());
        System.out.println(s1.getMarks());
        //for s2

        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getFees());
        System.out.println(s2.getMarks());
        
    }
}
