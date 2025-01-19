class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + this.power;
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 35, "Money");
        Hero hero2 = new Hero("Superman", 40, "Everything");
        System.out.println(hero1);
        System.out.println(hero2);
    }
}
