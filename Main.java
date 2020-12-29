import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        //Создание потока
        Theard theard =new Theard( );
        //Ввод данных
        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }
        //Добавление вводиых данных
        theard.GetValues(a,k,queries);
        //Запуск и вывод вычислений
        theard.start();


    }
}
class Theard extends Thread implements IOperations {
    private  int [] a;
    private  int k;
    private int [] queries;

    public void GetValues(int[] a, int k, int[] queries){
        this.a=a;
        this.k=k;
        this.queries=queries;
    }

    public void run (){
        int [] array=new int[a.length];
        for (int i=0;i<k;i++){
            int temp=a[a.length-1];
            for (int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        try {
            for (int i=0;i<a.length;i++){
                array[i]=a[queries[i]];
                System.out.print(array[i]);
            }

        }
        catch(Exception e){
            System.out.printf("Error index of array queries is not equal to array a ");

        }

    }


}
@FunctionalInterface
interface IOperations{
    void GetValues (int[] a, int k, int[] queries);
}