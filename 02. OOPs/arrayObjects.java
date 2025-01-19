class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}

public class arrayObjects {
    public static void main(String[] args) {
        Food food1 = new Food("Pizza");
        Food food2 = new Food("HamBurger");
        Food food3 = new Food("Hotdog");

        Food[] items = { food1, food2, food3 };
        System.out.print(items[0].name + " ");
        System.out.print(items[1].name + " ");
        System.out.print(items[2].name);
    }
}
