package collection_demo;

import java.util.List;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {

        List friends = new Stack();
        List f = new Stack();
        f.add("swati");
        f.add("kajal");
        f.add("siwani");
        f.add("riya");

        friends.add("tom");
        friends.add("ajit");
        friends.add("aryan");
        friends.add("tarun");

        System.out.println("list of friends  : " + friends);
        friends.add(2, "sayam");
        System.out.println("list of friends  : " + friends);
        friends.addAll(f);

        System.out.println("list of friends  : " + f);
        System.out.println("list of friends  : " + friends);
        friends.contains("swati");

        System.out.println("is swati in your friends list  ? " + friends.contains("swati"));

        System.out.println(" is f in friends  ? " + friends.containsAll(f));
        List f2 = new Stack();
//        f2.add("priti");
        f2.addAll(f);
        System.out.println("f2 equals to f :"+f2.equals(f));
        f2.remove("swati");
        System.out.println("f2 equals to f :"+f2.equals(f));
        System.out.println(f2.isEmpty());
        f2.clear();
        System.out.println(f2.isEmpty());
        System.out.println(f.size());
        Object s[] = f.toArray();
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }

    }
}
