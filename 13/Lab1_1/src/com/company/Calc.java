package com.company;

public class Calc {
    static int pageCount(int n, int p) {
        System.out.println(Thread.currentThread().getName());
        if (p > n) {
            return -1;
        }
        else
        {
            int k = n - p;
            if (k > n / 2)
            {
                return n - k - 1;
            }
            else
            {
                return k;
            }
        }

    }
}
