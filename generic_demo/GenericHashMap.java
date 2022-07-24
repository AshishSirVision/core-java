
package generic_demo;

import java.util.HashMap;


public class GenericHashMap {
    public static void main(String[] args) {
          HashMap<Integer,String> obj=new HashMap();
        //key:value  pair
        obj.put(1, "Mayuri");
        obj.put(2, "vikas");
       // obj.put("3", "swati");
        obj.put(4, "Mayuri");
        System.out.println(obj);
        
    }
}
