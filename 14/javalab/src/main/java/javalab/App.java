package javalab;

import java.io.*;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        
        System.out.println("Enter integer broadcast range:");
        int broadcastRange = Integer.parseInt(scanner.nextLine());
        if (broadcastRange == 0) {
            scanner.close();
            throw new IOException("Unexpected broadcast range: zero");
        }

        System.out.println("Enter array of integer houses numbers:");
        int[] housesNumbers;
        String[] rawHousesNumbers = scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?").nextLine().split(" ");

        housesNumbers = new int[rawHousesNumbers.length];

        for (int i = 0; i < housesNumbers.length; i++) {
            housesNumbers[i] = Integer.parseInt(rawHousesNumbers[i]);
        }

        Runnable r = () -> {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(System.getProperty("user.dir") + File.separator + "solution.txt")
                );
                System.out.printf("%s started... \n", Thread.currentThread().getName());
                System.out.println("Target houses for broadcast installation:");
                int result = Helper.ackerlandRadioTransmitters(broadcastRange, housesNumbers);
                bufferedWriter.write("Number of houses for broadcast installation: " + String.valueOf(result));
                bufferedWriter.newLine();
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(r,"MyThread");
        myThread.start();
        
        scanner.close();
    }
}
