import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // While Loop

        Scanner sc = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name :");
            name = sc.nextLine();
        }

        System.out.println("Hey " + name);

        // For Loop

        for (int i = 10; i >= 0;) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Happy Birthday!");

        // Nested Loop

        int rows;
        int columns;
        String symbol;

        System.out.println(" Enter number of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        columns = sc.nextInt();
        System.out.println("Enter the desired symbol : ");
        symbol = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

        // for-each loop

        String[] animals = { "cat", "rat", "bat" };
        ArrayList<String> animal = new ArrayList<String>();

        animal.add("cat");
        animal.add("rat");
        animal.add("bat");

        for (String i : animals) {
            System.out.println(i);
        }

        for (String i : animal) {
            System.out.println(i);
        }

        sc.close();
    }
}
