/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.overloading;

class OverloadingCalculation2 {



    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String args[]) {
        OverloadingCalculation2 obj = new OverloadingCalculation2();
        obj.sum(2, 20);//now int arg sum() method gets invoked 
    }
}