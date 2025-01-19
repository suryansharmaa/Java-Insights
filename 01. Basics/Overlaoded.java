public class Overlaoded {
    public static void main(String[] args) {

        int sum = add(3, 2);
        int sums = add (3, 2, 1);
        System.out.println(sum);
        System.out.println(sums);
    }

    static int add(int a, int b){
        System.out.println("Method Overloading #1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("Method Overloading #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("Method Overloading #3");
        return a+b+c+d;
    }
}
