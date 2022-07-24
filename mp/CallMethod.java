package mp;
class resources
{
void printtable(int n)
{
    for (int i = 0; i <= 10; i++) 
    {
        System.out.println(n + " * " + i + " = " + (n*i)); 
    }
}
}     

class Task1
        {
    
}

class Task2
        {
    
}
class Task3
        {
    
}
public class CallMethod {
    public static void main(String[] args) {
      resources obj=new resources();
      obj.printtable(2);
    }
}
