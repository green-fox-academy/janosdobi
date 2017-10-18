import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;

public class LotteryFilter {

    private List<String[]> fileContent;
    private List<String[]> filteredContent;

    public void readFile() {
        try {
            CSVReader reader = new CSVReader(new FileReader("C:/Users/PC-DJ/Documents/GreenFox/janosdobi/Week6/Day3/lotteryfilter/src/main/resources/otos.csv"), ';');
            fileContent = reader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String input) {
        try {
            CSVReader reader = new CSVReader(new FileReader(String.format("C:/Users/PC-DJ/Documents/GreenFox/janosdobi/Week6/Day3/lotteryfilter/src/main/resources/%s", input)), ';');
            fileContent = reader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("C:/Users/PC-DJ/Documents/GreenFox/janosdobi/Week6/Day3/lotteryfilter/src/main/resources/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeAll(fileContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String output) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(String.format("C:/Users/PC-DJ/Documents/GreenFox/janosdobi/Week6/Day3/lotteryfilter/src/main/resources/%s", output)), ';', CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeAll(fileContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(int year) {
        contentFilterer(year);
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("C:/Users/PC-DJ/Documents/GreenFox/janosdobi/Week6/Day3/lotteryfilter/src/main/resources/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeAll(filteredContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void contentFilterer(int year) {
        filteredContent = new ArrayList<>();
        for (int i = 0; i < fileContent.size(); i++) {
            if (Integer.parseInt(fileContent.get(i)[0]) == year) {
                filteredContent.add(fileContent.get(i));
            }
        }
    }
}