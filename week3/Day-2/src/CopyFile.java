// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile("src/my-file.txt", "src/my-file2.txt"));
    }
    public static boolean copyFile (String fromFile, String toFile) {

        boolean status = false;
        Path fromPath = Paths.get(fromFile);
        Path toPath = Paths.get(toFile);

        try {
            List<String> fromList = Files.readAllLines(fromPath);
            Files.write(toPath, fromList);
            List<String> toList = Files.readAllLines(toPath);
            if(fromList.equals(toList)) {
                status = true;
            }
        } catch (IOException e) {

        }
        return status;
    }
}
