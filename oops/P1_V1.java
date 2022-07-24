/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
class Student_v1
{
    //instance variable
    int id;
    String name;
    int age;
    float fees;
    int marks;
}



public class P1_V1 {
    public static void main(String[] args) {
        //create object of the class
        Student_v1 s1=new Student_v1();
        Student_v1 s2=new Student_v1();
        
        //using object give value to the instance variable
          //for s1
        s1.id=111;
        s1.name="Avinash";
            //for s2
        s2.id=112;
        s2.name="anjali";
        s2.age=22;
        s2.fees=434.32f;
        s2.marks=98;
        
        //using object display the value of instace variable
        //for s1
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.fees);
        System.out.println(s1.marks);
        //for s2
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.fees);
        System.out.println(s2.marks);
        
    }
}
