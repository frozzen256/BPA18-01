import java.util.*;

class MyRunner implements Runnable{
    public void run(){
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
        System.out.println("Количество самых высоких свечей: " + k);
        System.out.println("Вывод результатов дочернего тока закончен");
    }
}

public class Solution {
    public static int[] scores;
    private static final Scanner scanner = new Scanner(System.in);
    static int[] ar;
    
    public static void main(String[] args){

        System.out.println("Запуск главного потока");

        System.out.println("Введите количество свечей: ");
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ar = new int[arCount];

        System.out.println("Введите высоту свечей: ");
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        MyRunner r = new MyRunner();
        new Thread(r).start();
        System.out.println("Главный поток закончен");
        scanner.close();
    }
}
