package abstraction;

interface Remo1{
    int num = 20; // By default, public static final
    void dash1(); // By default, public abstract
    void dash2();
}


interface Remo2{
    int num = 40;
    void dash1();
    void dash2();
}



class RemoInherit implements Remo1, Remo2{
    public void dash1(){
        System.out.println("Hello world");
    }

    public void dash2() {
        System.out.println("Hello country");
    }
    public void dash3() {
        System.out.println(Remo2.num);
    }
}

public class InterfaceLearn {
    public static void main(String[] args) {
        int x = Remo1.num;
        System.out.println("x = " + x);
    }
}
