package com.yourself;


import org.junit.Assert;
import org.junit.Test;

public class CountStairTest {

    @Test
    public void test() {
        try {
            Assert.assertEquals("Running count_stair(0)...", 1, CountStair.count_stair(0));
            Assert.assertEquals("Running count_stair(1)...", 1, CountStair.count_stair(1));
            Assert.assertEquals("Running count_stair(2)...", 2, CountStair.count_stair(2));
            Assert.assertEquals("Running count_stair(3)...", 3, CountStair.count_stair(3));
            Assert.assertEquals("Running count_stair(4)...", 5, CountStair.count_stair(4));
            Assert.assertEquals("Running count_stair(5)...", 8, CountStair.count_stair(5));
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
        // Constraint: you can take 1 or 2 steps each time.
        // Parameter: n is the number of stairs.
        // REQUIRES: n > 0
        // EFFECTS: returns the count of different ways one can go up a flight of stairs.
        public static int count_stair(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return count_stair(n-1) + count_stair(n-2);
            }
        }
    }
}
