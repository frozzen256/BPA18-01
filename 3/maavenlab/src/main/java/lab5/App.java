package maavenlab.src.main.java.lab5;

public final class App {
    
    public static void main(String[] args) {
        System.out.println("Лабораторная #5");
    }

    public static int Candles(int[] scores) {
        int max = 0;
        int k = 0;
        int[] ar = {3, 2, 1, 3};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int i = 0; i <  ar.length; i++) {
            if ( ar[i] == max) {
                k++;
            }
        }
        return k;
    }
}

