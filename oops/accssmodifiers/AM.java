package oops.accssmodifiers;

import oops.accssmodifiers2.A;




public class AM extends A {
    
     public void msg() {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
       AM obj=new AM();
       obj.msg();//compile time rerror
    }
}
