import java.io.*;
import java.util.*;


public class Solution_oop{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        System.out.println("Введите количество свечей: ");
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        System.out.println("Введите высоту свечей: ");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Candles cn = new Candles();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = 0;
        result = cn.Candle(ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
class Candles
{
    static int Candle(int[] ar) {
        int max = ar[0];
        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>max){
                max=ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max){
                k++;
            }
        }
        return k;
    }
}