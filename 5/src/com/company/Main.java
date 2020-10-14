package com.company;
import java.io.*;
import java.util.*;


public class Main {

    /*
     * Реализовать функцию вычисляющую высоту дерева. Дерево растет в два цикла каждый год.
     * Каждую весну его высота удваевается, каждое лето дерево прибавляет один метр. Дерево высаживается высотой 1 метр.
     * Вычислить высоту дерева через n - циклов роста.
     *
     * Дано:    t - количество тестовых примеров
     *	        n - количество циклов роста
     *  	    1 <= t <= 10
     * 	        0 <= n <= 60
     * Пример:
     *          2
     *		    0
     *		    4
     *
     * Решение:
     *		    1
     *		    7
     */

    static int calc_tree_height(int n) {
        int tree_height = 1;
        int spring = 2;
        int summer = 1;
        for (int i = 0; i<n;i++){
            if ((i%2)==0){
                tree_height *= spring;
            }
            else{
                tree_height += summer;
            }
        }
        return tree_height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Hello, BPA18-01!");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));
        System.out.println("Введите количество тестовых примеров: ");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Введите количество циклов роста: ");
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int result = 0;
            result = calc_tree_height(n);
            System.out.println("Result: " + result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
