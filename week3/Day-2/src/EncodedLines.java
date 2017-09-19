import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        decoder("src/encoded-lines.txt");
        
    }

    public static void decoder(String fileName) {

        Path myPath = Paths.get(fileName);
        ArrayList<Integer> decodedIntArray = new ArrayList<>();
        String output = "";


        try {

            for (String lines: Files.readAllLines(myPath)) {

                for (int i = 0; i < lines.length(); i++) {
                    if(lines.charAt(i) != 32) {
                        decodedIntArray.add((lines.charAt(i) - 1));
                    } else {
                        decodedIntArray.add((lines.charAt(i) + 0));
                    }
                }

            }

            int[] decodeArray = new int[decodedIntArray.size()];
            for (int i = 0; i < decodedIntArray.size(); i++) {
                decodeArray[i] = decodedIntArray.get(i);

            }

            for (int i = 0; i < decodeArray.length; i++) {
                output += (char) decodeArray[i];
            }

            System.out.println(output);

        } catch (IOException e) {


        }
    }
}
