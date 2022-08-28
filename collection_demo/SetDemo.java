package collection_demo;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet bag = new HashSet();
        bag.add(12);
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
