import java.util.Arrays;

public class Functi {
    private int k;
    private int[] ar = new int[k];

    private static int sockMerchant(int[] ar){
        int n = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != 0) {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        ar[i] = 0;
                        ar[j] = 0;
                        n++;
                        break;
                    }
                }
            }
        }
        return n;
    }

    public void Fo(){
        this.ar = Arrays.copyOf(ar,k);
    }
    public static int getSock(int[] ar){
        return sockMerchant(ar);
    }

    public int getK() { return k; }

    public void setK(int k) { this.k = k; }

    public int[] getAr() { return ar; }

    public void setAr(int i, int value) { this.ar[i] = value; }
}
