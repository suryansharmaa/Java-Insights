import java.util.Scanner;

class Animals {
    public void speak() {
        System.out.println("Animal speaks ");
    }
}

class DOG extends Animals {
    @Override
    public void speak() {
        System.out.println("Dog barks !");
    }
}

class CAT extends Animals {
    @Override
    public void speak() {
        System.out.println("Cat meows!");
    }
}

public class dynamicPolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals animal;

        System.out.println("What animal do you want?");
        System.out.print("(1 : Dog) or (2 : Cat) : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new DOG();
        } else if (choice == 2) {
            animal = new CAT();
        } else {
            animal = new Animals();
            System.out.println("Invalid Choice!!");
        }
        animal.speak();

        scanner.close();
    }
}
