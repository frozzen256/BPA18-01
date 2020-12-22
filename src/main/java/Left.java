import java.util.Scanner;

public class Left extends  Algorithm {
    private int n;
    private int k;
    private int q;
    private  int[] rezult;

    public Left(int n, int k, int q) {
        super(n, k, q);
        this.n=n;
        this.k=k;
        this.q=q;

    }


    @Override
    public int[] Movement() {
        int [] a=new int [n];
        Scanner scanner=new Scanner(System.in);
        String [] aItems=scanner.nextLine().split(" ");
        if (aItems.length==n){
            for (int i=0;i<n;i++){
                a[i]=Integer.parseInt(aItems[i]);
            }
            int [] queri=new int [q];
            for (int i=0;i<q;i++){
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                queri[i]=scanner.nextInt();
            }
            Left(a,queri);
            return rezult;
        }
        else {
            System.out.println("Ошипка,вводимый массив превышает значение основного массива!");
            return new int [0];
        }
    }
    public void Left(int []a,int [] queri){
        rezult=new int [a.length];
        for (int i=0;i<k;i++){
            int temp=a[0];
            for (int j=1;j<a.length;j++){
                a[j-1]=a[j];
            }
            a[a.length-1]=temp;
        }
        try {
            for (int i=0;i<a.length;i++){

                rezult[i]=a[queri[i]];
            }

        }catch(Exception e){
            System.out.printf("Error index of array queries is not equal to array a ");
            rezult= new int [a.length];
        }
    }
}