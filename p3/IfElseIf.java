package p3;
public class IfElseIf {
    public static void main(String[] args) {
        int per=50;
        boolean con1=per>=80;
        boolean con2=per>=60;
        boolean con3=per>=45;
        boolean con4=per>=35;
        if(con1)
        {
            System.out.println("Grade 0");
        }
        else if(con2)
        {
            System.out.println("Grade A");
        }
        
        else if(con3)
        {
            System.out.println("Grade B");
        }
         else if(con4)
        {
            System.out.println("Grade C");
        }
         else 
        {
            System.out.println("Fail");
        }
        
    }
}
