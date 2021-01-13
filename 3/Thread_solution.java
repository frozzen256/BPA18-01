import java.io.*;
import java.util.*;


public class Thread_solution{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Главный поток запущен...");

        System.out.println("Введите количество свечей: ");
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        System.out.println("Введите высоту свечей: ");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        Thread_candle cn = new Thread_candle(ar);

        new Thread(()->{
            cn.run();
        }).start();

        scanner.close();
        System.out.println("Главный поток завершен...");
    }
} 