/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.superkey;

class Shape
{
    String color="Blue";
    void display()
    {
        System.out.println("display method of Shape");
    }
}
class Circle extends Shape
{
    String color="Yellow";
    void display()
    {
        System.out.println(color);
        System.out.println(super.color);
        
        System.out.println("display method of circle");
    }    
}



public class VariableRefer {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.display();
    }
   
}
