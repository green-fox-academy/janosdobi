// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(sumOfLines("src/my-file.txt"));

    }

    public static int sumOfLines(String fileName) {
        int counter = 0;
        try {
            Path myPath = Paths.get(fileName);
            List<String> myList = Files.readAllLines(myPath);
            counter = myList.size();
        } catch (IOException e) {

        }
        return counter;
    }
}
