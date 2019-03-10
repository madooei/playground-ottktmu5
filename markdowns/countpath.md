

# Count Paths

Meet _bugbug_ the Caterpillar. 

![](https://github.com/madooei/playground-ottktmu5/blob/master/markdowns/assets/bug.png?raw=true)

Imagine bugbug is in an $`M`$ by $`N`$ grid. He starts at the bottom left corner, $`(0,
0)`$, and wants to end up at the top right corner $`(M-1, N-1)`$. 

![](https://github.com/madooei/playground-ottktmu5/blob/master/markdowns/assets/grid.png?raw=true)

Bugbug is only capable of moving **right** or **up**. Write a function `count_paths` that takes a grid length and
width and returns the number of different paths bugbug can take from the start to the goal. (There is a closed-form solution to this problem, but try to answer it procedurally using recursion.)

@[Implement Count Path]({"stubs": ["src/main/java/com/yourself/CountPath.java"],"command": "com.yourself.CountPathTest#test"})