public class Printf{
    public static void main(String[] args) {

        // [Flags] [Precision] [Width] [Conversion-Character] 
        
        System.out.println("This is a prinf example statement!");
        System.out.printf("This is a prinf example statement %s!", "lol");
        System.out.println();
        System.out.printf("You've got %.1f CGPA last sem!", 9.0);         //Precision
        System.out.println();
        System.out.printf("This is a prinf example statement %s!", "lol");

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 32;
        double myDouble = 1000;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        System.out.printf("Hello %10s", myString);        //Width
        System.out.println();
        System.out.printf("Hello %-10s", myString);

        System.out.printf("Hello, You've got %+.2f rupees.", myDouble);      //Flags
        System.out.printf("Hello, You've got %020f rupees.", myDouble);
        System.out.printf("Hello, You've got %,.2f rupees.", myDouble);


    }
}