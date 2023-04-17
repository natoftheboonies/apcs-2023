package unit11;

// 2019 FRQ #3
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=9
import java.util.ArrayList;
import java.util.Arrays;

public class Delimiters {
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object where open is the open delimiter and close is
     * the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in
     * part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        return null; // replace me
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as described
     * in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */
        return false; // replace me
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        Delimiters ex1 = new Delimiters("(", ")");
        String[] tokens = { "(", "x + y", ")", " * 5" };
        ArrayList<String> result = ex1.getDelimitersList(tokens);
        check(result.size() == 2);
        String[] expected = { tokens[0], tokens[2] };
        check(Arrays.equals(expected, result.toArray()));

        Delimiters ex2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = { "<q>", "yy", "</q>", "zz", "</q>" };
        result = ex2.getDelimitersList(tokens2);
        check(result.size() == 3);
        String[] expected2 = { tokens2[0], tokens2[2], tokens2[4] };
        check(Arrays.equals(expected2, result.toArray()));

        Delimiters ex3 = new Delimiters("<sup>", "</sup>");

        String[] case1 = { "<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>" };
        check(ex3.isBalanced(new ArrayList<String>(Arrays.asList(case1))) == true);

        String[] case2 = { "<sup>", "</sup>", "</sup>", "<sup>" };
        check(ex3.isBalanced(new ArrayList<String>(Arrays.asList(case2))) == false);

        ArrayList<String> case3 = new ArrayList<String>();
        case3.add("</sup>");
        check(ex3.isBalanced(case3) == false);

        String[] case4 = { "<sup>", "<sup>", "</sup>" };
        check(ex3.isBalanced(new ArrayList<String>(Arrays.asList(case4))) == false);

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}