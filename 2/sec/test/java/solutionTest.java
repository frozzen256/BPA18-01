import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class solutionTest {

    @Test
    void sockMerchant_first() {
        int actual = solution.sockMerchant(new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
        assertEquals(3,actual);
    }

    @Test
    void sockMerchant_second(){
        int actual = solution.sockMerchant(new int[] {20, 20, 10, 30, 50, 10, 20});
        assertEquals(2,actual);
    }
    @Test
    void sockMerchant_third(){
        int actual = solution.sockMerchant(new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
        assertEquals(0,actual);
    }
}