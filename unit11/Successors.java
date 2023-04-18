package unit11;

// 2017 FRQ #4
// https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-frq-2017.pdf#page=16
import java.util.Arrays;

class Position {
    int r;
    int c;

    /** Constructs a Position object with row r and column c. */
    public Position(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public String toString() {
        return "(" + r + "," + c + ")";
    }
}

public class Successors {
    public static Position findPosition(int num, int[][] intArr) {
        // TODO part a

        return null; // replace me
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        // TODO part b

        return null; // replace me
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        int[][] array = { { 15, 5, 9, 10 }, { 12, 16, 11, 6 }, { 14, 8, 13, 7 } };
        check(findPosition(8, array).toString().equals("(2,1)"));
        check(findPosition(17, array) == null);

        Position[][] result = getSuccessorArray(array);
        check(result.length == 3);
        check(result[0].length == 4);
        String[][] expected = {
                new String[] { "(1,1)", "(1,3)", "(0,3)", "(1,2)" },
                new String[] { "(2,2)", null, "(1,0)", "(2,3)" },
                new String[] { "(0,0)", "(0,2)", "(2,0)", "(2,1)" } };
        String[][] mapped = Arrays.stream(result)
                .map(row -> Arrays.stream(row)
                        .map(col -> col == null ? null : col.toString())
                        .toArray(String[]::new))
                .toArray(String[][]::new);
        check(Arrays.deepEquals(expected, mapped));

        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
