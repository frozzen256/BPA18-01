package com.company;

import java.util.Scanner;

public class Funct {
    private int[] gr;
    private int n;

     public void setGr(int[] gr){
            this.gr = gr;
     }
    public void setN(int n){
        this.n = n;
    }
   public void funn () {
       System.out.println(Thread.currentThread().getName());
       for (int i = 0; i < n; i++) {
          /* System.out.println("Введите балл студента " + (i + 1));
           Scanner in = new Scanner(System.in);
           gr[i] = in.nextInt();*/
           if (gr[i] % 5 >= 3) {
               gr[i] = ((gr[i] / 5) + 1) * 5;
               System.out.println(gr[i]);
           } else {
               gr[i] = (gr[i] / 5) * 5;
               System.out.println(gr[i]);
           }
           if (gr[i] >= 40) {
               System.out.println("Студент " + (i + 1) + " аттестован");
           } else {
               System.out.println("Студент " + (i + 1) + " не аттестован");
           }

       }
   }
        public int[] getGR() {
        return gr;
    }

    }


