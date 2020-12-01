package bpa1801.variant11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        LilysHomework task = new LilysHomework(arr);
        try {
            Thread t = new Thread(task);
            // запускаем решение задачи в отдельном потоке
            t.start();
            // ждём пока поток завершится
            t.join();
            // извлекаем результат
            int result = task.getResult();
            String outFile = System.getenv("OUTPUT_PATH");
            if (outFile != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFile));
                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
                bufferedWriter.close();
            } else {
                System.out.println(String.valueOf(result));
            }
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }
        scanner.close();
    }
}
