import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        Path myPath = Paths.get("my-file.txt");
        List<String> list = null;
        try {
            list = Files.readAllLines(myPath);
        } catch (NullPointerException ex) {
            System.out.println("Unable to read file: my-file.txt");
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
        for (String line: list) {
            System.out.println(line);
        }
    }
}
