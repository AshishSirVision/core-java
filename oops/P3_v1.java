/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author admin
 */

class Student3_v1
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


public class P3_v1 {
     public static void main(String[] args) {
        //create object of the class
        Student3_v1 s1=new Student3_v1();
        Student3_v1 s2=new Student3_v1();
        
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
s1.display();
        //for s2
        s2.display();
    }
}
