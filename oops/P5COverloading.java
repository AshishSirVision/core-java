package oops;
class Add
{
    public Add()
    {
        System.out.println("no input provided");
    }
      Add(int a)
    {
        System.out.println("1 input provided");
    }
      Add(float a)
    {
        System.out.println("f-1 input provided");
    }
       Add(float a,int b)
    {
        System.out.println("fi-2 input provided");
    }
        Add(int a,float b)
    {
        System.out.println("if-2 input provided");
    }
         Add(int a,int b)
    {
        System.out.println("ii-2 input provided");
    }
          Add(float a,float b)
    {
        System.out.println("ff-2 input provided");
    }
}


public class P5COverloading {
    public static void main(String[] args) {
        Add obj=new Add();
        Add oj=new Add(7);
         Add oj1=new Add(6.34f);
         Add oj2=new Add(6.5f,89);
        new Add(7,6.9f);
        new Add(56,89);
        new Add(6.34f,6.7f);
        
    }
}
