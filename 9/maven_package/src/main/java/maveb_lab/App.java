package maveb_lab;

/**
 * Hello world!
 */
public final class App {
    
    public static void main(String[] args) {
        System.out.println("Лабораторная с тестами");
    }

    public static int[] breakingRecords(int[] scores) {
        int[] k = new int[2];
        k[0] = 0; k[1] = 0;
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>max){
                max = scores[i];
                k[0]++;
            }
            if (scores[i]<scores[i-1]){
                k[1]++;
            }
        }
        return k;
    }
}
