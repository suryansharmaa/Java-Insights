public class Methods {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 19;

        int x= 2;
        int y= 4;

        yo(name , age);

        System.out.println(multiply(x, y));
    }

    static void yo(String name, int age){
        System.out.println("Yo, Sup? "+name);
        System.out.println("You're "+age);
    }

    //How to return in using method

    static int multiply(int x, int y){
        return x*y;
    }
}
