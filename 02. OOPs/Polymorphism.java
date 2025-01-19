class whip {
    public void go() {
    }
}

class Audi extends whip {
    @Override
    public void go() {
        System.out.println("Whip goes Vroom Vroom!");
    }
}

class BMW extends whip {
    @Override
    public void go() {
        System.out.println("The BMW goes swoosh!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Audi R8 = new Audi();
        BMW Bike = new BMW();
        whip[] race = { R8, Bike };
        for (whip x : race) {
            x.go();
        }
    }
}
