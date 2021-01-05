package bpa1801.variant11.editor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    private BufferedReader reader;

    public FileLineReader(String file) {
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (IOException ex) {
            System.out.println(String.format("Failed to open file: %s", ex.getMessage()));
        }
    }

    public String next() {
        if (reader != null) {
            try {
                String line =  reader.readLine();
                if (line == null) {
                    reader.close();
                }
                return line;
            } catch (IOException ex) {
                System.out.println(String.format("Failed to read line: %s", ex.getMessage()));
            }
        }
        return null;
    }
}
