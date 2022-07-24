// this to pass as an argument in the method
package oops.constructor;

public class S2 {
    void m(S2 obj)
    {
        System.out.println("method is invoked");
    }
     void a(S2 obj)
    {
        System.out.println("method is invoked");
    }
      void b(S2 obj)
    {
        System.out.println("method is invoked");
    }
       void c(S2 obj)
    {
        System.out.println("method is invoked");
    }
        void d(S2 obj)
    {
        System.out.println("method is invoked");
    }
    void p()
    {
        m(this);
    }
     void q()
    {
       a(this);
    }
      void r()
    {
       b(this);
    }
       void s()
    {
        c(this);
    }
        void t()
    {
        d(this);
    }
    public static void main(String[] args) {
        S2 s1=new S2();
        s1.p();
        s1.q();
        s1.r();
        s1.s();
        s1.t();
    }
}
