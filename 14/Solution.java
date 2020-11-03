/*
*Акерленд - город с домами, расположенными вдоль дороги. Мэр хочет установить 
*радиопередатчики на крышах домов города. Каждый передатчик имеет фиксированный 
*диапазон, что означает, что он может передавать сигнал в пределах этого расстояния.
*По карте Акерленда и дальности передачи определите минимальное количество 
*передатчиков, чтобы каждый дом находился в пределах досягаемости хотя бы одного 
*передатчика. 
*
*Например дома расположены х=х[1,2,3,5,9], передатчик имеет покрытие 1. Для покрытия всех
*домов передатчик нужно разместить на домах 2, 5 и 9, т.е. необходимо 3 передатчика.
*
*Пример:
*
*5 1
*
*1 2 3 4 5
*Ответ: 2
*
*(на доме 2 и 4)
*
*Пример:
*
*8 2
*7 2 4 6 5 9 12 11
*Ответ: 3
*
*(на доме 4, 9 и 12)
*/

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the function below.
    static int ackerlandRadioTransmitters(int[] x, int k) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] x = new int[n];

        String[] xItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x[i] = xItem;
        }

        int result = ackerlandRadioTransmitters(x, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

