// { autofold
package com.yourself;


import java.util.Scanner;

public class CountDown {
    // }

    // REQUIRES: n >= 1
    // EFFECTS: prints out numbers from n to 1
    public static void countdown(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
    // { autofold
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("Count down ...");
        countdown(n);
    }
}
// }
