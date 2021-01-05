import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileLogger implements LoggerStrategy {
    private FileWriter writer;

    public SimpleFileLogger(String filename) throws IOException {
        writer = new FileWriter(filename, false);
    }

    @Override
    public void write(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
            System.out.println("Записал в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}