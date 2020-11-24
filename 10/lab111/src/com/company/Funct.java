package com.company;

import java.util.Scanner;

public class Funct {
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

}
