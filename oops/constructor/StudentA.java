//  use of this keyword
 // to refer current class instance variable
package oops.constructor;

 class StudentA {
    int rollno;
    String name;
    float fee;
    StudentA(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+""+name+""+fee);
    }
 }
    class TestThis2{
    public static void main(String[] args) {
        
        StudentA s1=new StudentA(111,"ankit",5000f);
        StudentA s2=new StudentA(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
