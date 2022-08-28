package generic_demo;
import java.util.ArrayList;
class Student
{
    int id=111;
    String name="tom";

    @Override
    public String toString() {
        return "[id :"+id+", name  :"+name+"]";
    }
    
    
    
}


public class GenericDemo 
{
   public static void main(String[] args)
   {
     ArrayList<Integer> bag=new ArrayList<Integer>();
     bag.add(12);
//     bag.add("tom");
     bag.add(164642);
     bag.add(1757572);
     bag.add(12767657);
     bag.add(156562);
     
     
      ArrayList<String> bag1=new ArrayList<String>();
      bag1.add("abc");
     bag1.add("dfe");
      
      
       System.out.println(bag);
     System.out.println(bag1);
     
      ArrayList<Student> grp=new ArrayList<Student>();
       System.out.println(new Student());
 grp.add(new Student());
 grp.add(new Student());
       System.out.println(grp); 
      
  }  
}
