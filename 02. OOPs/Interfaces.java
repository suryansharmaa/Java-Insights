interface Prey {
    void flee();
}

interface Predator {
    void hunt();
}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("Rabbit needs to run ");
    }
}

class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("I needa kill this bunny");
    }
}

class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("Small fish run");
    }

    @Override
    public void hunt() {
        System.err.println("Large fish attack");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Rabbit R = new Rabbit();
        R.flee();
        Hawk H = new Hawk();
        H.hunt();
        Fish F = new Fish();
        F.flee();
        F.hunt();
    }

}
