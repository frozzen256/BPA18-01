package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
        System.out.println(Thread.currentThread().getName());
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Введите количество страниц: ");
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        System.out.println("Введите нужную страницу: ");
        int p = scanner.nextInt();

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        Runnable runnable = () -> {
            int result = Calc.pageCount(n, p);
            if (result == -1) {
                System.out.println("Ошибка");
            } else {
                System.out.println("Количество страниц: " + result);
                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            }


            //bufferedWriter.close();

            scanner.close();
        };
        new Thread(runnable).start();
    }
}