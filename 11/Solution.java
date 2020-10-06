import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


 	/*
	* Всякий раз, когда Гоша просит Лизу потусоваться, она занята домашним заданием. 
	* Гоша хочет помочь ей закончить это быстрее. Можете ли вы помочь Гоше понять домашнее 
	* задание Лизы, чтобы она могла погулять с ним? 
	* Рассмотрим массив различных целых чисел. Можно менять местами любые два элемента массива 
	* любое количество раз. Массив "красив", если сумма разностей двух соседних элементов минимальна.
	* sum(|qrr[i] - arr[i - 1]|) -> min
	* Определите минимальное количество перестановок, которые должны быть выполнены 
	* для того, чтобы сделать массив "красивым".
	*
	* 1 <= n <= 10e5
	* 1 <= qrr[i] <= 2*10e9
	*
	* Пример: 4
	*         2 5 3 1
	* Ответ: 2
	*        1 <=> 2, 2 <=> 5
	*
	* Пример: 3
	*         2 3 1
	* Ответ: 1
	*	 1 <=> 2
	*/

    // Complete the lilysHomework function below.
    static int lilysHomework(int[] arr) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

         bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}