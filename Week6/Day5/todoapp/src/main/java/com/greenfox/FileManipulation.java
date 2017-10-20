package com.greenfox;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

    private List<String[]> linesOfFile;

    public FileManipulation () {
        linesOfFile = new ArrayList<>();
    }


    public void load() {
        try {
            CSVReader reader = new CSVReader(new FileReader("src/main/resources/Data.csv"), ';');
            linesOfFile =  reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getLinesOfFile() {
        return linesOfFile;
    }

    public void save() {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/Data.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeAll(linesOfFile);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}