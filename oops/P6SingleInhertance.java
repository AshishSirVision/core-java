package oops;
class TCSNQT
{
   protected int score=778;

    public TCSNQT(int score) {
        this.score = score;
    }
   }



class MNC extends TCSNQT
{

    public MNC(int score) {
        super(score);
    }
    
    void display()
    {
        System.out.println(super.score);
    }
    
}

public class P6SingleInhertance {
    public static void main(String[] args) {
     
        MNC obj=new MNC(778);
        obj.display();
        
    } 
}
