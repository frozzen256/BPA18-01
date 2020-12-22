package javalab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for App.
 */
public class AppTest 
{
    @Test
    public void checkAckerlandFunction()
    {
        System.out.println("Houses for test case #1:");
        assertEquals(Helper.ackerlandRadioTransmitters(1, new int[] {1, 2, 3, 4, 5}), 2);

        System.out.println("Houses for test case #2:");
        assertEquals(Helper.ackerlandRadioTransmitters(2, new int[] {7, 2, 4, 6, 5, 9, 12, 11}), 3);
    }
}
