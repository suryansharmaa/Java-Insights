class Friend {
    String name;
    static int numFriends;

    Friend(String name) {
        this.name = name;
        numFriends++;
    }

    static void display() {
        System.out.println("You have " + numFriends + " friends");
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        new Friend("Spoongebob");
        new Friend("Patrick");

        System.out.println(Friend.numFriends);
        Friend.display();

    }
}
