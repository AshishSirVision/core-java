package p3;
public class WrapperClass {
    public static void main(String[] args) {
        Byte b;
        Short s;
        Long l;
        Double d;
        Integer  i;
        Character c;
        Float f;
        Boolean bo;
                
        b=new Byte((byte)2);
        s=new Short((short)5);
        i=10;
        l=new Long((long)10083);
        f=new Float((float)3.13);
        d=new Double((double)843656);
        c='h';
        bo=true;
        
       System.out.println(b);
       System.out.println(s);
       System.out.println(i);
       System.out.println(l);
       System.out.println(f);
       System.out.println(d);
       System.out.println(c);
       System.out.println(bo);
    }
}
