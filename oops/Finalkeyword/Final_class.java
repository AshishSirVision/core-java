package oops.Finalkeyword;

 class Bike7 {

    void run() {
        System.out.println("running");
    }
}
//final class can not be inherit
public  final class Final_class extends Bike7 {
    
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Final_class m = new Final_class();
        m.run();
    }
}
