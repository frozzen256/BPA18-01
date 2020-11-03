import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution {

    /*
     * Федор работает в магазине одежды. У него есть большая куча носков,
     * которые он должен разобрать по парам по цвету для продажи.
     * По заданному массиву целых чисел, представляющих цвет каждого носка,
     * определите, сколько пар носков с совпадающими цветами существует.
     * 1 <= n <= 100, n - количество пар носков
     * 1 <= ar[i] <= 100 - цвета носков
     *
     * Пример: 9
     *         10 20 20 10 10 30 50 10 20
     * Ответ: 3
     */


    // Complete the sockMerchant function below.
    //public static int sockMerchant(int[] ar) {}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        Functi func = new Functi();
        int result = func.getSock(ar);
        System.out.println("Количество пар " + result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/

        bufferedWriter.close();

        scanner.close();
    }
}
