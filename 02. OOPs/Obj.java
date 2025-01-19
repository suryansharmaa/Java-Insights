class Car {

    String Company = "Chevrolet";
    String Model = "Corvette";
    int year = 2020;
    double price = 50000.00;

    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("Step on brakes");
    }
}

public class Obj {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar1.drive();
        myCar2.brake();

        System.out.println(myCar2.Company + " " + myCar2.Model);
    }
}