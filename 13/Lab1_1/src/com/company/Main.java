package com.company;

import java.io.*;
import java.util.*;

public class Main {

    /* Учитель рисования просит класс открыть книги по номеру страницы.
     * Иван можете начать перелистывать страницы книги сначала или с конца.
     * Всегда переворачивает страницы по одной. Когда открывает книгу, то 1 страница всегда находится справа.
     * Последняя страница может быть напечатана на одной странице,
     * зависет от количества страниц в книге.
     * Сколько раз минимум нужно Ивану перевернуть сраницы, чтобы найти нужную.
     * Листать можно как сначала, так и с конца.
     *
     * n - количество страниц в книге
     * p - номер нужной страницы
     * 1 <= n <= 10e5
     * 1 <= p <= n
     *
     * Пример: 6 2;	4 5;
     * Ответ:  1;	0.
     */




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(MyThread.currentThread().getName());

        //scanner.close();
    }
}

class MyThread extends Thread {

    public void run() {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        lymb count = () -> {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество страниц: ");
        int n = scanner.nextInt();

        System.out.println(MyThread.currentThread().getName());
        System.out.println("Введите нужную страницу: ");
        int p = scanner.nextInt();
        int result = 0;

        if (p > n) {
            System.out.println("Ошибка");
        }
        else
        {
            int k = n - p;

            if (k > n / 2)
            {
                result = n - k - 1;
            }
            else
            {
                result = k;
            }
            if (result == -1) {
                System.out.println("Ошибка");
            } else {
                System.out.println("Количество страниц: " + result);
                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
                //bufferedWriter.close();
            }
        }
            return result;
        };
        count.pageCount();
    }



    public interface lymb {
        public int pageCount ();
    }

}
