package oops.superkey;

import java.util.Scanner;

class Person {

    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class Emp extends Person {

    float salary;

    Emp(int id, String name, float salary, int age) {
        super(id, name, age);//parent class constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary+" "+age);
    }
}

public class TestSuper {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id :");
        int a=sc.nextInt();
        
        System.out.println("Enter the name :");
        String b=sc.next();
        
        System.out.println("Enter the salary :");
        float c=sc.nextFloat();
        
        System.out.println("Enter the  age:");
        int d=sc.nextInt();
                
        
                Emp e1 = new Emp(a, b, c, d);
        e1.display();
    }
}
