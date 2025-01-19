class Cars {
    String name;

    Cars(String name) {
        this.name = name;
    }
}

class Garage {
    static void park(Cars Cars) {
        System.out.println("The " + Cars.name + " is parked here.");
    }
}

public class objPassing {
    public static void main(String[] args) {
        Cars Cars1 = new Cars("BMW");
        Cars Cars2 = new Cars("Audi");

        Garage.park(Cars2);
        Garage.park(Cars1);
    }
}
