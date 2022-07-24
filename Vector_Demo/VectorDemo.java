package Vector_Demo;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        Vector v2 = new Vector(2,7);
        
        System.out.println("Initial size:" + v.size());
        System.out.println("Initial capacity:" + v.capacity());
        
        v.addElement(1);
        v.addElement(2);
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        
        v2.addAll(v);
        System.out.println("capacity after four additions:" + v.capacity());
        v.addElement(new Double(5.45));
        
        System.out.println("current capacity:" + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        
        System.out.println("Initial capacity:" + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        
        System.out.println("Initial capacity:" + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
          
        System.out.println("First element:" + (Integer)v.firstElement());
        
        System.out.println("last element:" + (Integer)v.lastElement());
        
       if(v.contains(new Integer(3)))
        System.out.println("Vector contains 3");
       
            Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements())
        {
            System.out.print(vEnum.nextElement() + ", ");
        }
        
        v2.addElement("tom");
        v2.addElement(78988);
        v2.addElement(77.6f);
        v2.addElement(676767.67);
        v2.addElement("t");
        
        
        System.out.println();
          Enumeration vEnum1 = v2.elements();
        System.out.println("\nElements in vector:");
        while(vEnum1.hasMoreElements())
        {
            System.out.print(vEnum1.nextElement() + ", ");
        }
        
        System.out.println();
    }
 
}
