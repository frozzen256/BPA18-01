package javalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper 
{
    public static int ackerlandRadioTransmitters(int broadcastRange, int[] housesNumbers) {
        Arrays.sort(housesNumbers);
        List<Integer> broadcastHouseNumbers = new ArrayList<Integer>();
        int i = 0;
        // Find first broadcast house 
        for (int j = housesNumbers.length - 1; j >= i; j--) {
            if (housesNumbers[i] + broadcastRange >= housesNumbers[j]) {
                broadcastHouseNumbers.add(housesNumbers[j]);
                System.out.print(housesNumbers[j] + " "); // PRINT HOUSE NUMBER
                i = j;
                break;
            }
        }
        // Find intermediate broadcast house
        while (housesNumbers[i] + broadcastRange <= housesNumbers[housesNumbers.length - 1] - broadcastRange) {
            for (int j = i; j < housesNumbers.length; j++) {
                if (housesNumbers[i] + broadcastRange <= housesNumbers[j] - broadcastRange) {
                    broadcastHouseNumbers.add(housesNumbers[j]);
                    System.out.print(housesNumbers[j] + " "); // PRINT HOUSE NUMBER
                    i = j;
                    break;
                }
            }
        }
        // Check the last house for broadcast installation
        if (housesNumbers[i] + broadcastRange < housesNumbers[housesNumbers.length - 1]) {
            broadcastHouseNumbers.add(housesNumbers[housesNumbers.length - 1]);
            System.out.print(housesNumbers[housesNumbers.length - 1] + " "); // PRINT HOUSE NUMBER
        }
        System.out.println();
        return broadcastHouseNumbers.size();
    }
}
