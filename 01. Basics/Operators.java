import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        // This one is for logical operators

        Scanner sc = new Scanner(System.in);

        // AND Operator
        System.out.println(" Enter Marks : ");
        int Marks = sc.nextInt();

        if (Marks >= 85) {
            System.out.println("Your grade is O");
        } else if (Marks < 85 && Marks >= 70) {
            System.out.println("Your grade is A+");
        } else {
            System.out.println("Your marks doesn't matter!");
        }

        // OR Operator

        System.out.println("Game begins. Press s to start!");
        String game = sc.nextLine();

        if (game.equals("s") || game.equals("S")) {
            System.out.println("Start the game!");
        } else {
            System.out.println("You want to quit?");
        }

        // NOT Statement

        System.out.println("Game begins. Press s to start!");
        String response = sc.nextLine();

        if (!response.equals("s") && !response.equals("S")) {
            System.out.println("Start the game!");
        } else {
            System.out.println("You want to quit?");
        }

        sc.close();

        // Algebraic Operators

        double u = 1;
        int t = 2;
        u += 1;
        t++;
        System.out.println(u);
        System.out.println(t);

        double v = 10;
        u = (double) v / 3;
        System.out.println(u);

    }
}
