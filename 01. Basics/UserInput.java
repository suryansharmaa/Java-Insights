import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Name?");
        String name = scanner.nextLine();

        System.out.println("Studying?");
        String code = scanner.nextLine();

        System.out.println("Your age?");
        int age = scanner.nextInt();

        System.out.println("My name is " + name);
        System.out.println("Studying " + code);
        System.out.println("My age is : " + age);

        scanner.close();
    }

}
