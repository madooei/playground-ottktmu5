# Recursion 101

A _recursive_ function is a function that calls itself. Here’s a recursive function:

```java
public static int factorial (int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n-1);
    }
}
```

Although we haven't finished defining factorial, we are still able to call it since the function body is not evaluated until the function is called. We do have one base case: when $n$ is $0$ or $1​$. Now we can compute `factorial(2)` in terms of `factorial(1)`, and `factorial(3)` in terms of `factorial(2)`, and `factorial(4)` – well, you get the idea.

There are _three_ common steps in a recursive definition:

1. **Figure out your base case**: What is the simplest argument we could possibly get? For
  example, `factorial(0)` is $1$ by definition.
2. **Make a recursive call with a simpler argument**: Simplify your problem, and assume that
  a recursive call for this new problem will simply work. This is called the "leap of faith." For `factorial`, we reduce the problem by calling `factorial(n-1)`.
3. **Use your recursive call to solve the full problem**: Remember that we are assuming the recursive call works. With the result of the recursive call, how can you solve the original problem you were asked? For `factorial`, we just multiply $(n − 1)!$ by $n$.