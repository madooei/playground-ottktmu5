package com.yourself;

public class PlayGround {

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

    private static void test_count_stair(){
        System.out.println(count_stair(1)); // 1
        System.out.println(count_stair(2)); // 2 {{1, 1}, {2}}
        System.out.println(count_stair(3)); // 3 {{1,1,1}, {1, 2}, {2, 1}}
        System.out.println(count_stair(4)); // 5 {{1,1,1,1}, {1,2,1}, {2,1,1}, {1,1,2}, {2,2}}
        System.out.println(count_stair(5)); // 8
        // {
        //   {1,1,1,1,1},
        //   {1,1,1,2},
        //   {1,1,2,1},
        //   {1,2,1,1},
        //   {2,1,1,1},
        //   {1,2,2},
        //   {2,2,1},
        //   {2,1,2}
        // }
    }

    // Goal: count how many different ways one can go up a flight of stairs.
    // Constraint: you can up to and including k steps each time.
    // Parameter: n is the number of stairs, k is the number of steps you may take.
    // REQUIRES: n > 0 && k > 0
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

    private static void test_count_k(){
        System.out.println(count_k(1, 2)); // 1
        System.out.println(count_k(2, 2)); // 2 {{1, 1}, {2}}
        System.out.println(count_k(3, 2)); // 3 {{1,1,1}, {1, 2}, {2, 1}}
        System.out.println(count_k(4, 2)); // 5 {{1,1,1,1}, {1,2,1}, {2,1,1}, {1,1,2}, {2,2}}
        System.out.println(count_k(5, 2)); // 8
        // {
        //   {1,1,1,1,1},
        //   {1,1,1,2},
        //   {1,1,2,1},
        //   {1,2,1,1},
        //   {2,1,1,1},
        //   {1,2,2},
        //   {2,2,1},
        //   {2,1,2}
        // }
        System.out.println(count_k(3, 3)); // 4 { {3}, {2, 1}, {1, 2}, {1, 1, 1} }
        System.out.println(count_k(4, 4)); // 8
        System.out.println(count_k(10, 3)); // 274
        System.out.println(count_k(300, 1)); // 1

    }

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

    private static void test_count_paths(){
        System.out.println(CountPath.count_paths(1,1)); // 1
        System.out.println(CountPath.count_paths(1,4)); // 1
        System.out.println(CountPath.count_paths(3,1)); // 1
        System.out.println(CountPath.count_paths(3,4)); // 10
        System.out.println(CountPath.count_paths(3,3)); // 6
        System.out.println(CountPath.count_paths(7,8)); // 1716
    }



    public static void main(String[] args) {
        test_count_k();
    }

}
