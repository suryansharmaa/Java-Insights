import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;

public class audioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Call_out_my_name.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response;
        System.out.println("P : Play, S : Stop, R : Reset, Q : Quit");
        System.out.print("Enter your response : ");

        response = scanner.nextLine();
        response = response.toUpperCase();

        while (!response.equals("Q")) {

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                default:
                    System.out.println("Not a valid response!");
                    break;
            }
            break;
        }
        System.out.println("Byeeeeeee");
        scanner.close();
    }
}
