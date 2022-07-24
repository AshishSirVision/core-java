package oops;
//Overloading--compile time polymorphism
   //same method name diffrent parameters
               //change datatype of parameters
               //change number of parameters
class Addition
{
    //method
    //method name :add
    //return type void
    //access specifiers static
    //access modifers public
    //parameter : 0 
   public static void add()
    {
        System.out.println("no input provided");
    }
      void add(int a)
    {
        System.out.println("1 input provided");
    }
      void add(float a)
    {
        System.out.println("f-1 input provided");
    }
      static float add(float a,int b)
    {
        //System.out.println("fi-2 input provided");
        return a+b;
    }
        void add(int a,float b)
    {
        System.out.println("if-2 input provided");
    }
         void add(int a,int b)
    {
        System.out.println("ii-2 input provided");
    }
          void add(float a,float b)
    {
        System.out.println("ff-2 input provided");
    }
          void add(float a,float b,float c)
    {
        System.out.println("fff-3 input provided");
    }
          
}

public class P5Overloading {
    public static void main(String[] args) {
        Addition obj=new Addition();
        
      Addition.add();
      obj.add(7676);
      obj.add(7.8f);
        System.out.println(Addition.add(7.8f,7676));
      obj.add(7,76.76f);
      obj.add(7,6);
      obj.add(12.3f,34.5f);
      obj.add(12.3f,34.5f,6.7f);
      
        
    }
}
