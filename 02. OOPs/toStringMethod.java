class Vehicle {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println(car.toString());
        System.out.println(car);
    }
}
