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
        String duplicateString = "";
        StringBuilder readableSB = new StringBuilder();
        String readableString = "";

        try {
            List<String> duplicateList = Files.readAllLines(myPath);
            duplicateString = duplicateList.toString();
            for (int i = 1; i < duplicateString.length(); i+= 2) {
                readableSB.append(duplicateString.charAt(i));
            }
            System.out.println(readableSB);

        } catch (IOException e) {

        }
    }
}
