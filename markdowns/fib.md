Consider a function that requires more than one recursive call. A simple example is the recursive fibonacci function: 

```java runnable
// { autofold
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
```

This type of recursion is called tree recursion, because it makes more than one recursive call in its recursive case. If we draw out the recursive calls, we see the recursive calls in the shape of an upside-down tree: 

![](https://github.com/madooei/playground-ottktmu5/blob/master/markdowns/assets/tree.png?raw=true)

We could use loops to write the same procedure. However, problems that are naturally solved using tree recursive procedures are generally difficult to write iteratively. 

As a general rule of thumb, whenever you need to try multiple possibilities at the same time, you should consider using recursion. 

**Counting problems** are a good example of this fact, and in the following exercises we will learn how to solve them. 