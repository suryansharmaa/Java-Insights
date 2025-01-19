abstract class VEHICLE {
    abstract void go();
}

class fourwheeler extends VEHICLE {
    @Override
    void go() {
        System.out.println("The driver is driving the Car");
    }
}

public class abstractKeyword {
    public static void main(String[] args) {
        fourwheeler Car = new fourwheeler();
        Car.go();
    }
}