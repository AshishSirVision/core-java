package oops.constructor;
class Book1
{
    String name;
    int pageno;
    float cost;
    double price;
   String  publisher;
    Book1(String name,int pageno,String publisher)
    {
        this.pageno=pageno;
        this.name=name;
        this.publisher=publisher;
    }
    Book1(String name,int pageno,float cost,double price,String publisher)
    {
    this(name,pageno,publisher);
     this.cost=cost;
     this.price=price;
}
  void display()
  {
      System.out.println(name+","+pageno+","+cost+","+price+","+publisher);
  }
}
public class ThisPassInConstructor
{
    public static void main(String[] args) {
        Book1 s1=new Book1("abc",12,450,98067,"kim");
        Book1 s2=new Book1("def",34,780,45678,"jim");
        s1.display();
        s2.display();
    }
 }
