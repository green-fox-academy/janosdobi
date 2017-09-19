import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers otos.csv

        lotteryFind("src/otos.csv");

    }

    public static void lotteryFind(String fileName) {
        Path myPath = Paths.get(fileName);
        ArrayList<Integer> lotteryArray= new ArrayList<>();

        try {

            List<String> inputList = Files.readAllLines(myPath);
            for (String line : inputList) {
                for (int i = 11; i < 16; i++) {
                    String[] array = line.split(";");
                    lotteryArray.add(Integer.valueOf(array[i]));
                }
            }
            Map<Integer, Integer> m = new HashMap<Integer, Integer>();

            for (int a : lotteryArray) {
                Integer freq = m.get(a);
                m.put(a, (freq == null) ? 1 : freq + 1);
            }

            int max = -1;
            int mostFrequent = -1;

            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                if (e.getValue() > max) {
                    mostFrequent = e.getKey();
                    max = e.getValue();
                }
            }

            System.out.println(mostFrequent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
