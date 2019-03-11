# Recursion

A _recursive_ function is a function that calls itself. Here’s a recursive function:

```java
// REQUIRES: n >= 0
// EFFECTS: returns n!
public static long factorial (int n) {
    if (n == 0) {
        return 1;
    } else {
        return factorial(n-1) * n;
    }
}
```

Now we can compute `factorial(4)` in terms of `factorial(3)`, and `factorial(3)` in terms of `factorial(2)`, and `factorial(2)` – well, you get the idea. 

![](https://github.com/madooei/playground-ottktmu5/blob/master/markdowns/assets/trace.png?raw=true)

Recall, a recursive function is defined in terms of *base cases* and *recursive steps*.

- In a base case, we compute the result immediately given the inputs to the function call. For
  example, `factorial(0)` is $`1`$ by definition.
- In a recursive step, we compute the result with the help of one or more *recursive calls* to this same function, but with the inputs somehow reduced in size or complexity, closer to a base case.  For `factorial`, we reduce the problem by calling `factorial(n-1)`.

There are _three_ common steps in a recursive definition:

1. **Figure out your base case**: What is the simplest argument we could possibly get? 
2. **Make a recursive call with a simpler argument**: Simplify your problem, and assume that
    a recursive call for this new problem will simply work. This is called the "leap of faith."
3. **Use your recursive call to solve the full problem**: Remember that we are assuming the recursive call works. With the result of the recursive call, how can you solve the original problem you were asked? For `factorial`, we just multiply $`(n − 1)!`$ by $`n`$.