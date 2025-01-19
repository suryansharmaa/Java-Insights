import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("HotDog");

        food.set(0, "Sushi");
        food.remove(3);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // 2D Arraylists Code :

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> foodList = new ArrayList<String>();

        foodList.add("Pizza");
        foodList.add("Hamburger");
        foodList.add("HotDog");

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("Coffee");
        drinksList.add("Mazza");
        drinksList.add("Tea");

        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("Milk");
        bakeryList.add("Pastry");
        bakeryList.add("Chocolate");

        groceryList.add(foodList);
        groceryList.add(drinksList);
        groceryList.add(bakeryList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(2).get(0));

    }
}