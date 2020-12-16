import java.util.*;


class breakingRecords extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Запуск дочернего потока");
        int[] k = new int[2];
        k[0] = 0; k[1] = 0;
        int max = Thread_Solution.scores[0];
        for (int i = 1; i < Thread_Solution.scores.length; i++) {
            if (Thread_Solution.scores[i]>max){
                max = Thread_Solution.scores[i];
                k[0]++;
            }
            if (Thread_Solution.scores[i]<Thread_Solution.scores[i-1]){
                k[1]++;
            }
        }

        for (int i = 0; i < k.length; i++) {
            System.out.println(String.valueOf(k[i]));

            if (i != k.length - 1) {
                System.out.println(" ");
            }
        }
        System.out.println("Вывод результатов дочернего тока закончен");
    }
}
public class Thread_Solution
{
    public static int[] scores;
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        breakingRecords Result = new breakingRecords(); // Создание потока
        System.out.println("Запуск главного потока");

        System.out.println("Введите количество игр: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scores = new int[n];

        System.out.println("Введите очки за каждую игру через пробел: ");
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        Result.start();
        System.out.println("Главный поток закончен");
        scanner.close();
    }
}