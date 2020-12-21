package main.java.com.rukosenpa;/*

Учитывая двумерный массив цифр или сетку, попробуйте найти вхождение заданного двумерного шаблона цифр. Например, рассмотрим следующую сетку:

1234567890
0987654321
1111111111
1111111111
2222222222
Предположим, нам нужно найти следующий массив 2D-шаблонов:

876543
111111
111111
Двухмерный узор начинается со второй строки и третьего столбца сетки. Т.е.. шаблон присутствует в сетке.

Описание функции

Функция должна вернуть YES, если шаблон существует в сетке, или NO в противном случае.

gridSearch имеет следующие параметры:

G: сетка для поиска, массив строк
P: шаблон для поиска, массив строк

Формат ввода

В первой строке записано целое число - количество тестов.

Каждый из тестовых случаев t представлен следующим образом:
Первая строка содержит два целых числа через пробел R и C, указывающие количество строк и столбцов в сетке G.
Далее следуют строки R.
Следующая строка содержит два целых числа, разделенных пробелами, r и c, указывающие количество строк и столбцов в сетке шаблона.
За ним следуют строки r, каждая из которых содержит строку цифр, представляющую шаблон.

Пример входных данных:
2
10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530
15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99

Ответ:
YES
NO
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Insert grid dimension");
        int gDim = 0;
        int gRowDim = 0;
        while (gDim == 0 || gRowDim == 0) {
            String gDims = scanner.nextLine().trim();
            try {
                gDim = Integer.parseInt(gDims.split(" ")[0].trim());
                gRowDim = Integer.parseInt(gDims.split(" ")[1].trim());
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Wrong format of dimensions. Insert another...");
            }
        }

        final String[] grid = new String[gDim];
        boolean correctString = false;
        String sample = "";
        for (int i = 0; i < gDim; i++) {
            System.out.printf("Insert %d row of Grid%n", i + 1);
            while (!correctString) {
                sample = scanner.next();
                if (sample.length() == gRowDim) {
                    correctString = true;
                } else {
                    System.out.println("Incorrect row format. Try another...");
                }
            }
            grid[i] = sample;
            correctString = false;
        }

        System.out.println("Insert pattern dimension");

        int pDim = 0;
        int pDimRow = 0;

        while (pDim == 0 || pDimRow == 0) {
             String pDims = scanner.next();
            try {
                pDim = Integer.parseInt(pDims.split(" ")[0].trim());
                pDimRow = Integer.parseInt(pDims.split(" ")[1].trim());
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Wrong dimensions format. Insert another...");
            }
        }
        final String[] pattern = new String[pDim];
        correctString = false;
        for (int i = 0; i < pDim; i++) {
            System.out.printf("Insert %d row of Pattern%n", i + 1);
            while (!correctString) {
                sample = scanner.next();
                if (sample.length() == gRowDim) {
                    correctString = true;
                } else {
                    System.out.println("Incorrect row format. Try another...");
                }
            }
            pattern[i] = sample;
            correctString = false;
        }

        new Thread(() -> {
            System.out.println("New  Started");
            Grid gridAbstraction = new Grid(grid);

            String result = gridAbstraction.searchPattern(pattern) ? "YES" : "NO";
            System.out.println(result);

        }).start();

    }
}