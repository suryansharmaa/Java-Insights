import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number to divide : ");
            int x = scanner.nextInt();
            System.out.print("Enter a number to divide by : ");
            int y = scanner.nextInt();
            int z = x / y;
            System.err.println("Result : " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        finally {
            System.out.println("This block will run anyways.");
        }
        scanner.close();
    }
}
