/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.superkey;

class Shape1
{
    private String color="Blue";
    void display()
    {
        System.out.println(color);
        System.out.println("display method of Shape");
    }
}
class Circle1 extends Shape1
{
     private String color="Yellow";
    void display()
    {
        super.display();
        System.out.println(color);
        System.out.println("display method of circle");
    }    
}



public class MethodRefer {
    public static void main(String[] args) {
        Circle1 c=new Circle1();
        c.display();
    }
   
}
