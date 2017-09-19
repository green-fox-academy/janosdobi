import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        reverse("src/reversed-lines.txt");
    }

    public static void reverse(String fileName) {

        Path myPath = Paths.get(fileName);
        ArrayList<String> correctList = new ArrayList<>();

        try {

            for (String reversed : Files.readAllLines(myPath)) {

                String correct = "";
                for (int i = reversed.length() - 1 ; i >= 0 ; i-- ) {
                    correct = correct + reversed.charAt(i);
                }
                correctList.add(correct);
            }
            Files.write(myPath, correctList);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

