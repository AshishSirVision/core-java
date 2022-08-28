
package collection_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionPro1 {
    public static void main(String[] args) {
//        ArrayList al=new ArrayList();
//        Stack al=new Stack();
//        LinkedList al=new LinkedList();
//        Vector al=new Vector();
        
        List al=new ArrayList();
        al.add(new Integer(125));  
        al.add(125);  
        al.add(new Float(712.5));  
        al.add("hello");
        al.add(true);
        al.add(false);
        System.out.println(al);
    }
}

