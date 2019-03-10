// { autofold
package com.yourself;

public class FibNum {
// }
// REQUIRES: n >= 0
// EFFECTS: return the n^th term in Fibonacci sequence
public static int fibnum(int n) {
    if (n==0 || n==1) {
        return 1;
    } else {
        return fibnum(n-1) + fibnum(n-2);
    }
}
// { autofold
public static void main(String[] args) {
    for(int n=0; n<=10; n++) {
        System.out.printf("%d, ", fibnum(n));
    }
    System.out.printf("...\n");
}
}
// }
