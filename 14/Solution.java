/*
*Акерленд - город с домами, расположенными вдоль дороги. Мэр хочет установить 
*радиопередатчики на крышах домов города. Каждый передатчик имеет фиксированный 
*диапазон, что означает, что он может передавать сигнал в пределах этого расстояния.
*По карте Акерленда и дальности передачи определите минимальное количество 
*передатчиков, чтобы каждый дом находился в пределах досягаемости хотя бы одного 
*передатчика. 
*
*Например дома расположены х=х[1,2,3,5,9], передатчик имеет покрытие 1. Для покрытия всех
*домов передатчик нужно разместить на домах 2, 5 и 9, т.е. необходимо 3 передатчика.
*
*Пример #1:
*
*1 
*1 2 3 4 5
*Ответ: 2
*
*(на доме 2 и 4)
*
*Пример #2:
*
*2
*7 2 4 6 5 9 12 11
*Ответ: 3
*
*(на доме 4, 9 и 12)
*/

import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static int ackerlandRadioTransmitters(int[] housesNumbers, int broadcastRange) {
        Arrays.sort(housesNumbers);
        List<Integer> broadcastHouseNumbers = new ArrayList<Integer>();
        int i = 0;
        // Find first broadcast house 
        for (int j = housesNumbers.length - 1; j >= i; j--) {
            if (housesNumbers[i] + broadcastRange >= housesNumbers[j]) {
                broadcastHouseNumbers.add(housesNumbers[j]);
                System.out.print(housesNumbers[j] + " ");
                i = j;
                break;
            }
        }
        // Find intermediate broadcast house
        while (housesNumbers[i] + broadcastRange <= housesNumbers[housesNumbers.length - 1] - broadcastRange) {
            for (int j = i; j < housesNumbers.length; j++) {
                if (housesNumbers[i] + broadcastRange <= housesNumbers[j] - broadcastRange) {
                    broadcastHouseNumbers.add(housesNumbers[j]);
                    System.out.print(housesNumbers[j] + " ");
                    i = j;
                    break;
                }
            }
        }
        // Check the last house for broadcast installation
        if (housesNumbers[i] + broadcastRange < housesNumbers[housesNumbers.length - 1]) {
            broadcastHouseNumbers.add(housesNumbers[housesNumbers.length - 1]);
            System.out.print(housesNumbers[housesNumbers.length - 1] + " ");
        }
        return broadcastHouseNumbers.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
            new FileWriter(System.getProperty("user.dir") + File.separator + "14" + File.separator + "solution.txt")
        );
        System.out.println("Enter integer broadcast range:");
        int broadcastRange = Integer.parseInt(scanner.nextLine());
        if (broadcastRange == 0) {
            bufferedWriter.close();
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
        System.out.println("Target houses for broadcast installation:");
        int result = ackerlandRadioTransmitters(housesNumbers, broadcastRange);

        bufferedWriter.write("Number of houses for broadcast installation: " + String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
