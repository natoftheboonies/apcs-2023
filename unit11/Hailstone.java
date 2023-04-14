package unit11;
// https://apclassroom.collegeboard.org/8/question_bank/questions/1123031?searchFor=all&searchTerm=2020

/**
 * A mathematical sequence is an ordered list of numbers. This question involves
 * a sequence called a hailstone sequence. If n
 * 
 * is the value of a term in the sequence, then the following rules are used to
 * find the next term, if one exists.
 * 
 * If n
 * 
 * is 1, the sequence terminates.
 * If n
 * is even, then the next term is n2
 * .
 * If n
 * is odd, then the next term is 3n+1
 * 
 * .
 * 
 * For this question, assume that when the rules are applied, the sequence will
 * eventually terminate with the term n=1
 */

public class Hailstone {

    /**
     * Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     * 
     */

    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        return -1; // replace me
    }

    /**
     * Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * (b) A hailstone sequence is considered long if its length is greater than its
     * starting value. For example, the hailstone sequence in example 1 (5, 16, 8,
     * 4, 2, 1) is considered long because its length (6) is greater than its
     * starting value (5). The hailstone sequence in example 2 (8, 4, 2, 1) is not
     * considered long because its length (4) is less than or equal to its starting
     * value (8).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        return false; // replace me
    }

    /**
     * Returns the proportion of the first n hailstone sequences that are considered
     * long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        return 0; // replace me
    }

    // There may be instance variables, constructors, and methods not shown.

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        check(Hailstone.hailstoneLength(5) == 6);
        check(Hailstone.hailstoneLength(7) == 17);
        check(isLongSeq(3));
        check(!isLongSeq(8));
        check(propLong(10) == 0.5);
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
