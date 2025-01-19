import java.util.Random;

class diceRoller {
    Random random = new Random();
    int number = 0;

    diceRoller() {
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

public class variableScope {
    public static void main(String[] args) {
        new diceRoller();
    }
}
