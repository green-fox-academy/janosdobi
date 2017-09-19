import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        reverse("src/reversed-order.txt");

    }

    public static void reverse(String fileName) {

        Path myPath = Paths.get(fileName);
        ArrayList<String> normalArray = new ArrayList<>();


        try {

            List<String> reversedList = Files.readAllLines(myPath);
            for (int i = reversedList.size() - 1; i > 0; i--) {
                normalArray.add(reversedList.get(i));
            }
            Files.write(myPath, normalArray);

        }catch (IOException e) {

        }
    }
}
