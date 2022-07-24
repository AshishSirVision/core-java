package collection_demo;

import java.util.ArrayList;

public class Collection_Demo {
   public static void main(String[] args) {
     ArrayList bag=new ArrayList();
     bag.add(12);
     bag.add(1.2f);
     bag.add("tom");
     bag.add('r');
          bag.add("tom");
     bag.add('r');
     bag.add(true);
     bag.add(new StringBuffer("hello"));
     bag.add(new String("World"));
       System.out.println(bag);
     
  } 
}
