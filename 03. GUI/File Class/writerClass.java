import java.io.FileWriter;
import java.io.IOException;

public class writerClass {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("secret.txt");
            writer.write("This text I am writing from Writer Class of File Class. \n Hopefully it works :)");
            writer.append("\n Appending another line Yo");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
