/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.superkey;

class Shape2 {

    private String color = "Blue";

    Shape2(int a) {
        System.out.println(color);
        System.out.println("display method of Shape" + a);
    }
}

class Circle2 extends Shape2 {

    private String color = "Yellow";

    Circle2() {
        super(8);
        System.out.println(color);
        System.out.println("display method of circle");
    }
}

public class ConstructorRefer {

    public static void main(String[] args) {
        Circle2 c = new Circle2();

    }

}
