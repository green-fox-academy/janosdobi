package com.greenfox;

import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

    private List<String[]> linesOfFile;

    public FileManipulation () {
        linesOfFile = new ArrayList<>();
    }

    public void loadFromFile() {
        try {
            CSVReaderBuilder reader = new CSVReaderBuilder(new FileReader("src/main/resources/Data.csv"));
            linesOfFile =  reader.build().readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveToFile() {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/Data.csv"));
            writer.writeAll(linesOfFile);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getLinesOfFile() {
        return linesOfFile;
    }

    public void setLineOfFile(LocalDateTime createdAt, LocalDateTime completedAt, String name, int id) {
        linesOfFile.add(new String[] {"","","",""});
        linesOfFile.get(linesOfFile.size() - 1)[0] = createdAt.toString();
        linesOfFile.get(linesOfFile.size() - 1)[1] = completedAt.toString();
        linesOfFile.get(linesOfFile.size() - 1)[2] = name;
        linesOfFile.get(linesOfFile.size() - 1)[3] = String.valueOf(id);
    }
}