package unit11;

// 2018 FRQ #4
//https://secure-media.collegeboard.org/ap/pdf/ap18-frq-computer-science-a.pdf#page=14
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTester {

    /**
     * Returns an array containing the elements of column c of arr2D in the same
     * order as
     * they appear in arr2D.
     * Precondition: c is a valid column index in arr2D.
     * Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        // TODO part a
        return null; // replace me!
    }

    /**
     * Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 have the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* implementation not shown */
        return IntStream.of(arr2).boxed().collect(Collectors.toList())
                .containsAll(IntStream.of(arr1).boxed().collect(Collectors.toList()));
    }

    /**
     * Returns true if arr contains any duplicate values;
     * false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        /* implementation not shown */
        Set<Integer> foo = new HashSet<Integer>();
        foo.addAll(IntStream.of(arr).boxed().collect(Collectors.toList()));
        return foo.size() < arr.length;
    }

    /**
     * Returns true if square is a Latin square as described in part (b);
     * false otherwise.
     * Precondition: square has an equal number of rows and columns.
     * square has at least one row.
     */
    public static boolean isLatin(int[][] square) {
        // TODO part b
        return false; // replace me!
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        int[][] arr2D = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
        int[] result = ArrayTester.getColumn(arr2D, 1);
        check(Arrays.equals(result, new int[] { 1, 4, 7, 5 }));

        int[][] latin = new int[][] { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
        check(ArrayTester.isLatin(latin));
        latin = new int[][] { { 10, 30, 20, 0 }, { 0, 20, 30, 10 }, { 30, 0, 10, 20 }, { 20, 10, 0, 30 } };
        check(ArrayTester.isLatin(latin));

        int[][] notLatin = new int[][] { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 2 } };
        check(!ArrayTester.isLatin(notLatin));
        notLatin = new int[][] { { 1, 2, 3 }, { 3, 1, 2 }, { 7, 8, 9 } };
        check(!ArrayTester.isLatin(notLatin));
        notLatin = new int[][] { { 1, 2 }, { 1, 2 } };
        check(!ArrayTester.isLatin(notLatin));
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
