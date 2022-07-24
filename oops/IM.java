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
public class IM {
    public static void main(String[] args) {
        
        Student2 tom=new Student2();
        tom.setId(27);
       tom.display();
      
       
        Student2 j=new Student2();
        j.setId(26);
        j.setName("Jerry");
        j.setAge(23);
        j.setFees(3553.56f);
        j.setMarks(45);
        j.display();
        
        
        Student2 k=new Student2();
        k.setId(26);
        k.setName("kale");
        k.setAge(23);
        k.setFees(3553.56f);
        k.setMarks(45);
        k.display();
       
        Student2 jack=new Student2();
       jack.display();
    }
}
