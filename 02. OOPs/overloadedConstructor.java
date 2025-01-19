class Pizza {
    String Sauce;
    String Cheese;
    String Toppings;

    Pizza(String Sauce, String Cheese) {
        this.Sauce = Sauce;
        this.Cheese = Cheese;
    }

    Pizza(String Sauce, String Cheese, String Toppings) {
        this.Sauce = Sauce;
        this.Cheese = Cheese;
        this.Toppings = Toppings;
    }

}

public class overloadedConstructor {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Tomato", "Mozerella", "Pepperino");
        System.out.println("Ingredient for Pizza : ");
        System.out.println(pizza.Sauce);
        System.out.println(pizza.Cheese);
        System.out.println(pizza.Toppings);
    }
}
