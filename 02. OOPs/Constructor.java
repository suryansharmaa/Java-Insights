class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}

public class Constructor {
    public static void main(String[] args) {

        Human man1 = new Human("Rick", 65, 70.60);
        Human man2 = new Human("Morty", 16, 52.96);

        man1.drink();
        man2.eat();
    }
}
