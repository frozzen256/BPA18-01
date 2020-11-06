package bpa1801.variant11;

import java.util.Arrays;

/**
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
class LilysHomework implements Runnable {

    private int result;

    private int[] arr;

    public LilysHomework(int[] inputArr) {
        arr = inputArr;
    }

    static int sortAscending(int[] arr) {
        int result = 0;
        // Сортировка выбором
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] < arr[min])
                    min = j;
            if (min != i) {
                int x = arr[i];
                arr[i] = arr[min];
                arr[min] = x;
                result += 1;
            }
        }
        return result;
    }

    static int sortDescending(int[] arr) {
        int result = 0;
        // Сортировка выбором
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] > arr[max])
                    max = j;
            if (max != i) {
                int x = arr[i];
                arr[i] = arr[max];
                arr[max] = x;
                result += 1;
            }
        }
        return result;
    }

    public int solve() {
        int resultAsc = sortAscending(Arrays.copyOf(arr, arr.length));
        int resultDesc = sortDescending(Arrays.copyOf(arr, arr.length));
        return resultAsc < resultDesc ? resultAsc : resultDesc;
    }

    @Override
    public void run() {
        result = solve();
    }

    public int getResult() {
        return result;
    }
}