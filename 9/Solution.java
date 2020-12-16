import java.io.*;
import java.util.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] k = new int[2];
        k[0] = 0; k[1] = 0;
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>max){
                max = scores[i];
                k[0]++;
            }
            if (scores[i]<scores[i-1]){
                k[1]++;
            }
        }
        return k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        System.out.println("Введите количество игр: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        System.out.println("Введите очки за каждую игру через пробел: ");
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}