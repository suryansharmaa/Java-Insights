class Vehicles {
    double speed;

    void go() {
        System.out.println("Vehicle is moving ");
    }

    void stop() {
        System.out.println("The vehicle is stopped");
    }
}

class CAR extends Vehicles {
    int wheels = 4;
    int doors = 4;
}

class BIKE extends Vehicles {
    int wheels = 4;
}

public class Inheritance {
    public static void main(String[] args) {
        CAR car = new CAR();
        BIKE bike = new BIKE();
        car.go();
        bike.stop();

    }
}
