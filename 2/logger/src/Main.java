import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите поведение:");
        System.out.println("1 - Вывод сообщение в консоль");
        System.out.println("2 - Вывод сообщение в файл");
        System.out.println("3 - Вывод в файл с текущим временем + сообщение в файл");

        int choose = scan.nextInt();

        LoggerStrategy logger;
        //выбор поведения (стратегии)
        switch (choose) {
            case 1:
                logger = new ConsoleLogger();
                break;

            case 2:
                logger = new SimpleFileLogger("simpleloggerfile.txt");
                break;

            case 3:
                logger = new TimedFileLogger("timedloggerfile.txt");
                break;

            default:
                System.out.println("Вы ввели неверный символ");
                return;
        }
        //наборы фраз для вывода
        List<String> phrases = new ArrayList<>();
        phrases.add("You only call when the cup’s empty");
        phrases.add("Yeah, yeah, yeah, yeah");
        phrases.add("So do you ever think it’s");
        phrases.add("Time we stop pretending");
        phrases.add("That these late nights don’t leave us empty?");
        phrases.add("Empty, empty, yeah, yeah");
        phrases.add("I don’t wanna feel");
        phrases.add("Empty, empty, yeah, yeah, yeah, yeah");

        Random rand = new Random(phrases);

        //вывод
        logger.write(rand.getPhrase());
    }
}