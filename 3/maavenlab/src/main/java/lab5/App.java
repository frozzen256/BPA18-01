package lab5;

/**
 * Hello world!
 */
public final class App {
    
    public static void main(String[] args) {
        System.out.println("Лабораторная #5");
    }

    public static int[] Candles(int[] scores) {
        int max = Solution.ar[0];
        int k = 0;
        for (int i = 0; i < Solution.ar.length; i++) {
            if (Solution.ar[i] > max) {
                max = Solution.ar[i];
            }
        }
        for (int i = 0; i <  Solution.ar.length; i++) {
            if ( Solution.ar[i] == max) {
                k++;
            }
        }
        return k;
    }
}
