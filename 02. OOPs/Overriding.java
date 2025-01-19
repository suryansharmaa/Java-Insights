class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.speak();
        dog.speak();
    }
}
