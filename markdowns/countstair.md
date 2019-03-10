# Count Stairs

You want to go up a flight of stairs that has $`n`$ steps. You can either take $`1`$ or $`2`$ steps each time. How many different ways can you go up this flight of stairs? Write a function `count_stair` that solves this problem for you. Assume $`n`$ is positive.

Before we start, what’s the base case for this question? 

::: What is the simplest input?

Could it be when there is one stair? or two stairs? or no stairs?

:::

After you’ve thought of a base case, think about a recursive call with a smaller argument that approaches the base case. 

::: Need a hint?

What do `count_stair(n - 1)` and `count_stair(n - 2)` represent? 

:::

Implement a recursive solution for `count_stair`:

@[Implement Count Path]({"stubs": ["src/main/java/com/yourself/CountStair.java"],"command": "com.yourself.CountStairTest#test"})



---



Consider a special version of the `count_stair` problem, where instead of taking $`1`$ or $`2`$ steps, we are able to take up to and including $`k`$ steps at a time. 

Write a function `count_k` that figures out the number of paths for this scenario. Assume $`n`$ and $`k`$ are positive. 

@[Implement Count Path]({"stubs": ["src/main/java/com/yourself/CountK.java"],"command": "com.yourself.CountKTest#test"})