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
    static int[] func(int[] gr,int k)
    {
        for (int i = 0; i < k; i++) {
            System.out.println("Введите балл студента " + (i+1));
            Scanner in = new Scanner(System.in);
            gr[i] = in.nextInt();
            if (gr[i] % 5 >= 3) {
                gr[i]=((gr[i] / 5) + 1) * 5;
                System.out.println(gr[i]);
            }
            else{
                gr[i]=(gr[i] / 5)  * 5;
                System.out.println(gr[i]);
            }

        }
        return gr;
    }




        private static final Scanner scan = new Scanner(System.in);

        public static void main (String[]args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            System.out.println("Введите колличетство студентов N= ");
            int n = Integer.parseInt(scan.nextLine().trim());
            if (n < 1 || n > 60) {
                System.out.println("Введено недопустимое количесвто студентов ");
            }
            int[] gr = new int[n];

          /*  for (int gradesItr = 0; gradesItr < n; gradesItr++) {
                int gradesItem = Integer.parseInt(scan.nextLine().trim());
                gr[gradesItr] = gradesItem;
            }*/

            int[] result = func(gr,n);
            for(int i=0;i<n;i++){
                if(result[i]>=40){
                    System.out.println("Студент " + (i+1) + " аттестован" );
                }
                else
                {
                    System.out.println("Студент " + (i+1) + " не аттестован" );
                }
            }
            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bw.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bw.write("\n");
                }
            }

            bw.newLine();

            bw.close();
        }
    }
