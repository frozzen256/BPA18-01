package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    /* Каждый студент оценивается по шкале от 0 до 100 баллов. Оценка меньше
     * 40 - не аттестован.
     * Итоговые результаты округляются до ближайщего числа, кратного 5,
     * если разница между оценкой и этим числом меньше 3. Результаты меньше
     * 38 не округляются.
     * Дано: n - количество студентов
     * 	g[i] - оценка студента
     * 	1 <= n <= 60
     * 	0 <= gr[i] <= 100
     * Вычислить  итоговые результаты.
     *
     */

    private static final Scanner scan = new Scanner(System.in);

    public static void main (String[]args) throws IOException {
        System.out.println(Thread.currentThread().getName());
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Введите колличетство студентов N= ");
        int n = Integer.parseInt(scan.nextLine().trim());
        if (n < 1 || n > 60) {
            System.out.println("Введено недопустимое количесвто студентов ");
        }
        int[] gr = new int[n];

           for (int gradesItr = 0; gradesItr < n; gradesItr++) {
                System.out.println("Введите балл студента " + (gradesItr + 1));
                int gradesItem = Integer.parseInt(scan.nextLine().trim());
                gr[gradesItr] = gradesItem;
            }
        Funct funct = new Funct();
        funct.setGr(gr);
        funct.setN(n);

        new Thread(funct::funn).start();
    }
}










