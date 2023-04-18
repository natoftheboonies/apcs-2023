package unit11;

import java.util.stream.IntStream;

// 2019 FRQ #4
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=15
public class LightBoard {
    /**
     * The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;

    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        /* TODO to be implemented in part (a) */

    }

    /**
     * Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col) {
        /* TODO to be implemented in part (b) */

        return false; // replace me!
    }

    // There may be additional instance variables, constructors, and methods not
    // shown.

    private LightBoard(boolean[][] board) {
        lights = board;
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        LightBoard partA = new LightBoard(700, 500);
        double result = IntStream.range(0, partA.lights.length)
                .mapToObj(idx -> Math.toIntExact(IntStream.range(0, partA.lights[idx].length)
                        .mapToObj(jdx -> partA.lights[idx][jdx]).filter(j -> j).count()))
                .mapToInt(i -> i.intValue()).sum() / (double) (partA.lights.length * partA.lights[0].length);
        check(result > .398 && result < .402);

        boolean[][] board = {
                { true, true, false, true, true },
                { true, false, false, true, false },
                { true, false, false, true, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, true, false, true, true },
                { false, false, false, false, false } };
        LightBoard partB = new LightBoard(board);
        check(!partB.evaluateLight(0, 3));
        check(partB.evaluateLight(6, 0));
        check(!partB.evaluateLight(4, 1));
        check(partB.evaluateLight(5, 4));
        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}