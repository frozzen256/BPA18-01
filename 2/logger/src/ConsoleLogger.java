public class ConsoleLogger implements LoggerStrategy {

    public ConsoleLogger() {}

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
