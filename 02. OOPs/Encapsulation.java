class wheel4 {
    private String make;
    private String model;
    private int year;

    wheel4(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        wheel4 Car = new wheel4("Chevrolet", "Camero", 2021);

        System.out.println(Car.getYear());
        Car.setYear(2022);
        System.out.println(Car.getMake());
        System.out.println(Car.getModel());
        System.out.println(Car.getYear());

    }
}
