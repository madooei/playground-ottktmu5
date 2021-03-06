Create a recursive `countdown` function that takes in an integer `n` and prints out a countdown from $`n`$ to $`1`$. 

First, think about a base case for the `countdown` function. 

::: What is the simplest input the problem could be given?

The simpleset input is where there is no need to count down! That is, when `n == 1` we simply print out $`1`$.

:::

After you’ve thought of a base case, think about a recursive call with a smaller argument that approaches the base case. 

::: Need a hint?

What happens if you call `countdown(n - 1)`?

:::

Then, put the base case and the recursive call together, and think about where a _print statement_ would be needed.


```java runnable
// { autofold
public class Main {
// }
// REQUIRES: n >= 1
// EFFECTS: prints out numbers from n to 1
public static void countdown(int n) {
    // TODO: complete the code here
}

public static void main(String[] args) {
    countdown(5);
}
// { autofold
}
// }
```

?[Is there an easy way to change "countdown" to count up instead?]
-[ ] Change the base case
-[ ] Change the recursive call
-[x] Change where the print statement is
-[ ] All of the above

```java runnable
// { autofold
public class Main {
// }
// REQUIRES: n >= 1
// EFFECTS: prints out numbers from 1 to n
public static void countup(int n) {
    // TODO: complete the code here
}

public static void main(String[] args) {
    countup(5);
}
// { autofold
}
// }
```