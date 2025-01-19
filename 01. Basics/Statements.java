import java.util.Scanner;

public class Statements {

    public static void main(String[] args) {

        // This code is for if-else statements

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a : ");
        int a = sc.nextInt();

        if (a >= 85) {
            System.out.println("Grade : O");
        } else if (a <= 84) {
            System.out.println("Grade : A+");
        } else if (a == 40) {
            System.out.println("Grade : Passed");
        } else {
            System.out.println("Failed");
        }
        sc.close();

        // This one is for switch statements

        String day = "Wednesday";

        switch (day) {
            case "Sunday":
                System.out.println("It's Sunday!");
                break;
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "Thursday":
                System.out.println("It's Thursday!");
                break;

            default:
                System.out.println("It's not a day");
                break;
        }

    }
}