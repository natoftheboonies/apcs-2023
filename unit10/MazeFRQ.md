# Maze FRQ

We began last week to use recursion to explore a map. For this assignment, we can use recursion to explore a maze! Consider a maze like this:

```
@..#..
...#..
.#.#..
##...$
```

Starting from `@`, we want to get to `$`. You may traverse through empty space (`.`) but not through walls (`#`). You may traverse horizontally and vertically. To solve the maze above, one solution would be `>>vvv>>>`.

```
@>>#..
..v#..
.#v#..
##v>>$
```

We have various mazes, and want to check if they have a solution. Below is a FRQ-ish class `Maze` with `/* TODO part x */` bits for you to fill in. It additionally has `/* not shown */` functions which you may call.

In class [`Maze.java`](Maze.java) I have partially implemented this FRQ. I implemented the "not shown" methods with intentionaly-confusing logic. Below, I implemented a function `check(boolean test)` which throws an AssertionError when the FRQ is not solved. Run the class now to see the result. You are welcome to change the message if "sad panda" annoys you. Once you have solved the FRQ, the bottom of the "main" method prints "Happy Panda! 🐼". As you complete parts a and b, it will still raise AssertionError until part c is also complete.

```java
class Maze {

  private char[][] grid;
  private boolean solution;

  public Maze(int rows, int cols, String maze) { /* TODO part a */ }

  /**
   * @returns coordinates of the starting location, as "r,c" (row, column)
   */
  public String getStart() { /* not shown */ }

  /**
   * @returns coordinates of the target location, as "r,c" (row, column)
   */
  public String getGoal() { /* not shown */ }

  /**
   * Explores the maze from point r,c to determine if there is a path
   * to the goal.
   */
  private void explore(int r, int c) { /* TODO part b */ }

  /**
   * Determins if the maze has a solution or not.
   */
  public boolean hasSolution() { /* TODO part c */ }

}
```

A Maze instance is instantiated by passing in the number of rows, columns, and a string representation of the maze contents. The maze above has 4 rows, 6 columns, and would be instantiated like `new Maze(4, 6, "@..#.....#..#..#..##...$")`

### Part A

Please implement the Maze constructor. We are not yet concerned with whether the maze has a solution.

### Part B

Next, please implement the `explore` method. This method should use recursion to determine if there is a path from the current point to the goal. Pseudocode follows:

- if the point r,c is in bounds and not a wall:
  - if we are at the goal:
    - set solution as true
  - else:
    - mark spot as visited
    - recurse right, down, left, up
    - mark spot as unvisited

Note that marking the spot as visited is a key 🔑 to prevent your explorer from an infinite loop going back retracing steps. For example, halfway through exploration of the maze above, we might have followed a path like `ex. 1` below, and should no longer recurse `up`:

```
@..#..  |   @>v#..
>>v#..  |   v<<#..
.#v#..  |   v#.#..
##...$  |   ##...$

ex. 1       ex. 2
```

Similarly, it is also important to unmark the spot as visited once recursion completes, or else we may inadvertently prevent other recursive calls from continuing as in `ex. 2` above.

### Part C

Finally, implement `hasSolution` to determine if the maze is has a solution or not.

Good luck!
