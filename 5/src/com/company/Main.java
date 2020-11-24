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
        System.out.println("Главный поток запущен...");
        JThread t = new JThread("JThread");
        t.start();
        try {
            t.join();
        }
        catch (InterruptedException e){
            System.out.printf("%s has been interrupted", t.getName());
        }
        System.out.println("Главный поток завершен...");

        scanner.close();
    }
}

