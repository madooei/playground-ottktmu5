package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class CountPathTest {

    @Test
    public void test() {
        try {
            Assert.assertEquals("Running count_path(1, 1)...", 1, CountPath.count_paths(1, 1));
            Assert.assertEquals("Running count_path(3, 1)...", 1, CountPath.count_paths(3, 1));
            Assert.assertEquals("Running count_path(1, 4)...", 1, CountPath.count_paths(1, 4));
            Assert.assertEquals("Running count_path(3, 4)...", 10, CountPath.count_paths(3, 4));
            Assert.assertEquals("Running count_path(3, 3)...", 6, CountPath.count_paths(3, 3));
            Assert.assertEquals("Running count_path(7, 8)...", 1716, CountPath.count_paths(7, 8));
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
        // Goal: count how many different paths one can take in order to get from
        // the bottom left corner to the top right corner of a grid.
        // Constraint: you can only move right or up.
        // Parameters: eight and width correspond the size of a rectangle grid.
        // REQUIRES: width >= 1 && height >= 1
        // EFFECTS: returns the count of paths
        public static int count_paths(int width, int height) {
            if (width == 1 || height == 1){
                return 1;
            } else {
                int go_right = count_paths(width - 1, height);
                int go_up = count_paths(width, height - 1);
                return go_right + go_up;
            }
        }
    }
}
