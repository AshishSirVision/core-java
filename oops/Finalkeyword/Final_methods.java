package oops.Finalkeyword;

class Bike {

    void run() {
        System.out.println("running");
    }
    
}

class Final_methods extends Bike {

    final void run() {//override not possible for final methods
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Final_methods m = new Final_methods();
        m.run();
    }
}
