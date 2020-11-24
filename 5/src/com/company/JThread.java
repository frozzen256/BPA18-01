package com.company;


import java.util.Scanner;

public class JThread extends Thread {

    private static final Scanner scanner = new Scanner(System.in);

    JThread(String name){
        super(name);
    }

    public void run(){

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
    }
}
