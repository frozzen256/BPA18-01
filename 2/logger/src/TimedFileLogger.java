import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimedFileLogger implements LoggerStrategy {
    private FileWriter writer;

    public TimedFileLogger(String filename) throws IOException {
        writer = new FileWriter(filename, false);
    }

    @Override
    public void write(String message) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
        try {
            writer.write(formatForDateNow.format(dateNow) + " ");
            writer.write(message + "\n");
            writer.flush();
            System.out.println("Записал в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}