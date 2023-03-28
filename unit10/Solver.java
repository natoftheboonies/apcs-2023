package unit10;

import java.util.Arrays;

public class Solver {

    /**
     * Given a integer array puzzle and goal, finds a solution of +/- puzzle
     * elements which sum to the goal.
     * 
     * Returns null if no solution is found.
     * 
     * @param puzzle   numbers to sum +/-
     * @param goal     target of our puzzle
     * @param solution solution proposal from prior calls
     * @return a solution to the puzzle of +/i integers, if found (reversed).
     */
    public static int[] solve(int[] puzzle, int goal, int[] solution) {
        if (puzzle.length == 1) {
            // base case
            if (puzzle[0] == goal) {
                // System.out.println("solved");
                return solution;
            }
            // no solution found
            return null;
        } else {
            // recursive case, shrinking "puzzle" towards base case (puzzle.length == 1)

            // split puzzle head (first elements) and tail (last element)
            int[] head = Arrays.copyOf(puzzle, puzzle.length - 1);
            int tail = puzzle[puzzle.length - 1];

            // try using -tail, so add to goal
            // build a new solution for this attempt with space for our guess
            int[] solNext = Arrays.copyOf(solution, solution.length + 1);
            solNext[solNext.length - 1] = -1 * tail; // guess negative
            int[] win = solve(head, goal + tail, solNext); // add to goal
            // if we find a solution, return it.
            if (win != null)
                return win;

            // try using +tail, so subtract from goal
            solNext = Arrays.copyOf(solution, solution.length + 1);
            solNext[solNext.length - 1] = tail; // guess positive
            win = solve(head, goal - tail, solNext); // subtract from goal
            if (win != null)
                return win;

            // no solution found
            return null;
        }

    }

    public static void main(String[] args) {

        // int[] puzzle = { 4, 10, 1, 6, 10, 9, 4, 2 };
        // int sum = 0;
        int[] puzzle = { 11, 6, 11, 10, 11, 1, 6, 7, 2, 6, 4, 6, 3 };
        int sum = 30;
        int[] solution = {};
        solution = solve(puzzle, sum, solution);

        // print solution as an expression
        if (solution != null) {
            // 1st number always positive
            System.out.print(puzzle[0]);
            // remaining numbers returned in reverse order
            for (int i = solution.length - 1; i >= 0; i--) {
                if (solution[i] >= 0)
                    System.out.print(" + " + solution[i]);
                else {
                    System.out.print(" - " + Math.abs(solution[i]));
                }
            }
            System.out.println(" = " + sum);
        } else
            System.out.println("No solution");

    }

    /*
     * Example
     * solve [1,2,3] = 0
     * start from tail, 3. Could be -3 or +3
     * -3: [1,2] = 3 (recursive case A)
     * +3: [1,2] = -3 (recursive case B)
     * 
     * recursive case A:
     * solve [1,2] = -3
     * start from tail, 2. Could be -2 or +2
     * -2: [1] = -5 (recursive case AA)
     * +2: [1] = -1 (recursive case AB)
     * 
     * recursive case B:
     * solve [1,2] = 3
     * start from tail, 2. Could be -2 or +2
     * -2: [1] = 5 (recursive case BA)
     * +2: [1] = 1 (recursive case BB)
     * 
     * recursive case AA:
     * solve [1] = -5
     * base case! Does 1 == -5? nope, return null.
     * 
     * recursive case AB:
     * solve [1] = -1
     * base case! Does 1 == -1? nope, return null.
     * 
     * recursive case BA:
     * solve [1] = 5
     * base case! Does 1 == 5? nope, return null.
     * 
     * recursive case BB:
     * solve [1] = 1
     * base case! Does 1 == 1? yes, we win!
     * 
     * 
     */
}
