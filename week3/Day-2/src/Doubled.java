import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt 

        decrypt("src/duplicated-chars.txt");
        
    }

    public static void decrypt(String fileName){

        Path myPath = Paths.get(fileName);
        String output= "";

        try {
            for (String lines: Files.readAllLines(myPath)) {
                for (int i = 0; i < lines.length(); i+= 2) {
                    output += lines.charAt(i);
                }
                output += "\n";
            }
            System.out.println(output);

        } catch (IOException e) {

        }
    }
}
