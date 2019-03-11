package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class CountKTest {

    @Test
    public void test() {
        try {
            Assert.assertEquals("Running count_k(1, 2)...", 1, CountK.count_k(1, 2));
            Assert.assertEquals("Running count_k(2, 2)...", 2, CountK.count_k(2, 2));
            Assert.assertEquals("Running count_k(3, 2)...", 3, CountK.count_k(3, 2));
            Assert.assertEquals("Running count_k(4, 2)...", 5, CountK.count_k(4, 2));
            Assert.assertEquals("Running count_k(5, 2)...", 8, CountK.count_k(5, 2));
            Assert.assertEquals("Running count_k(3, 3)...", 4, CountK.count_k(3, 3));
            Assert.assertEquals("Running count_k(4, 4)...", 8, CountK.count_k(4, 4));
            Assert.assertEquals("Running count_k(10, 3)...", 274, CountK.count_k(10, 3));
            Assert.assertEquals("Running count_k(300, 1)...", 1, CountK.count_k(300, 1));

            success(true);
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
        }
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    private static class Solution{
        // Goal: count how many different ways one can go up a flight of stairs.
        // Constraint: you can up to and including k steps each time.
        // Parameter: n is the number of stairs, k is the number of steps you may take.
        // REQUIRES: n >= 0 && k > 0
        // EFFECTS: returns the count of different ways one can go up a flight of stairs.
        public static int count_k(int n, int k) {
            if (n < 0) {
                return 0;
            } else if (n == 0 || n == 1) {
                return 1;
            } else {
                int count = 0;
                for (int i = 1; i<=k; i++) {
                    count += count_k(n-i, k);
                }
                return count;
            }
        }
    }
}
