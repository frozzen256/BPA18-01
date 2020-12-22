package com.company;
import javax.print.DocFlavor;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner=new Scanner(System.in);
        String[] nkq = scanner.nextLine().split(" ");
        int[] result;
        System.out.println("Выберите алгоритм смещения кнопка R(вправо), L(влево)");
        switch (scanner.nextLine()){
            case "R" :
                Algorithm right=new Right(Integer.parseInt(nkq[0]),Integer.parseInt(nkq[1]),Integer.parseInt(nkq[2]));
                result=right.Movement();
                break;
            case "L" :
                Algorithm left=new Left(Integer.parseInt(nkq[0]),Integer.parseInt(nkq[1]),Integer.parseInt(nkq[2]));
                result=left.Movement();
                break;
                default:
                    System.out.println("Вы выбрали не одно из смешений !");
                    result = new int [Integer.parseInt(nkq[0])] ;
                    break;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(Integer.toString(result[i]));
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}