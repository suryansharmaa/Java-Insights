import java.util.Random;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        // This code is for Math Functions

        float x = 3.14f;
        float y = -10f;
        float z = 4f;

        float a = Math.max(x, y);
        float b = Math.min(x, y);
        float c = Math.abs(y);
        double d = Math.sqrt(z);
        double e = Math.round(x);
        double f = Math.ceil(x);
        double g = Math.floor(x);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // Hypotenuse of a triangle

        double j;
        double t;
        double u;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x :");
        j = sc.nextDouble();
        System.out.println("Enter y :");
        t = sc.nextDouble();

        u = Math.sqrt((j * j) + (t * t));
        System.out.println("Hypotenuse : " + u);

        // This one is for random numbers

        Random random = new Random();

        int w = random.nextInt(6) + 1;
        double q = random.nextDouble();
        boolean n = random.nextBoolean();

        System.out.println(w);
        System.out.println(q);
        System.out.println(n);

        sc.close();
    }
}