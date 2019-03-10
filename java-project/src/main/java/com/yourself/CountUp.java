// { autofold
package com.yourself;

import java.util.Scanner;

public class CountUp {
// }
// REQUIRES: n >= 1
// EFFECTS: prints out numbers from 1 to n
public static void countup(int n) {
    if (n == 1) {
        System.out.println(1);
    } else {
        countup(n - 1);
        System.out.println(n);
    }
}
    // { autofold
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("Count down ...");
        countup(n);
    }
}
// }
