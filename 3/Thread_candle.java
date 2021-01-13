public class Thread_candle extends Thread {

    int[] Sol;
    Thread_candle(int[] ar){
        System.out.println("Дочерний поток запущен...");
        Sol = ar;
    }

    public void run(){
        int max = Sol[0];
        int k = 0;
        for (int i = 0; i < Sol.length; i++) {
            if (Sol[i]>max){
                max=Sol[i];
            }
        }
        for (int i = 0; i < Sol.length; i++) {
            if (Sol[i] == max){
                k++;
            }
        }
        System.out.println("Самых высоких свечей "+ k);
        System.out.println("Дочерний поток завершен...");
    }
}