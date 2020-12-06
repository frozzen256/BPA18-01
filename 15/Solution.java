/*
Джон Ватсон хочет проверить Шерлока Холмса. Он дал ему массив A0,A1 ... AN-1 . 
Выполнил некоторое преобразование массива, а затем задал Шерлоку Q вопросов. 
Шерлок чувствует, что преобразование, которое применил Джон, называется 
циклический сдвиг вправо на K. Циклический сдвиг вправо на 1 преобразует 
массив A0,A1 ... AN-1 в AN-1,A0 ... AN-2. Джон применил сдвиг на единицу K раз.
                                                                               
Помогите Шерлоку ответить на вопросы. Каждый вопрос описывается целым числом X,
в ответ на вопрос Шерлок должен выписать элемент AX преобразованного массива.

Формат входных данных:
Первая строка содержит три целых числа, записанных через пробел, N, K и Q.
Следующая строка содержит N целых чисел, записанных через пробел, - массив A.
Каждая из следующих Q строк содержит целое число X - описание текущего вопроса.

Формат выходных данных
Для каждого вопроса выведите соответствующий элемент преобразованного массива.

Ограничения
1 <= N <= 105
1 <= A[i] <= 105
1 <= K <= 105
1 <= Q <= 500
0 <= X <= N-1

Пример входных данных #00

3 2 3
1 2 3
0
1
2
Пример выходных данных #00

2
3
1
Пояснения к примерам
После первого циклического сдвига на 1 массив станет равен: 3 1 2.
После второго он станет равен: 2 3 1.
0-й элемент массива равен 2.
1-й элемент массива равен 3.
2-й элемент массива равен 1.

Sample Input 0

3 2 3
1 2 3
0
1
2
Sample Output 0

2
3
1
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] ArrayRot(int[] a, int k, int[] queries) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

       // int[] result = ArrayRot(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}