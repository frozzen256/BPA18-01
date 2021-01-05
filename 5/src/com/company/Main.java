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



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Hello, BPA18-01!");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));
        System.out.print("Введите количество тестовых примеров: ");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Tree spruce = new Tree();   // создание объекта spruce (ель)

        for (int tItr = 0; tItr < t; tItr++) {
            System.out.print("Введите количество циклов роста: ");
            spruce.n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int result = 0;
            result = spruce.getTreeHeight(spruce.n);    //  Вызов метода getTreeHeight у объекта spruce
            System.out.println("Result: " + result);    //  Вывод на экран

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}

class Tree{
    int n;                      //  Количество циклов роста
    int height= 1;              //  высота дерева (высаживается высотой 1 метр)
    int growthSpring = 2;       //  Рост дерева весной  (удваивается)
    int growthSummer= 1;        //  Рост дерева летом (прибавляет 1 метр)

    public int getTreeHeight(int n) {
        for (int i = 0; i<n;i++){
            if ((i%2)==0){
                height *= growthSpring;
            }
            else{
                height += growthSummer;
            }
        }
        return height;
    }
}
