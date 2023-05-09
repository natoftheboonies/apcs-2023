package unit12;

import java.util.Arrays;

class Candy {
    /** Returns a String representing the flavor of this piece of candy */
    public String getFlavor() {
        /* implementation not shown */
        return _flavor;
    }

    // There may be instance variables, constructors, and methods that are not shown
    private String _flavor;

    Candy(String flavor) {
        this._flavor = flavor;
    }
}

public class BoxOfCandy {
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    /**
     * Moves one piece of candy in column col, if necessary and possible, so that
     * the box
     * element in row 0 of column col contains a piece of candy, as described in
     * part (a).
     * Returns false if there is no piece of candy in column col and returns true
     * otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col) {
        /* to be implemented in part (a) */

        return false;
    }

    /**
     * Removes from box and returns a piece of candy with flavor specified by the
     * parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor) {
        /* to be implemented in part (b) */

        return null;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    static BoxOfCandy partA() {
        BoxOfCandy boxOfCandy = new BoxOfCandy();
        boxOfCandy.box = new Candy[][] {
                { null, new Candy("lime"), null },
                { null, new Candy("orange"), null },
                { null, null, new Candy("cherry") },
                { null, new Candy("lemon"), new Candy("grape") }
        };
        return boxOfCandy;
    }

    static BoxOfCandy partB() {
        BoxOfCandy boxOfCandy = new BoxOfCandy();
        boxOfCandy.box = new Candy[][] {
                { new Candy("lime"), new Candy("lime"), null, new Candy("lemon"), null },
                { new Candy("orange"), null, null, new Candy("lime"), new Candy("lime") },
                { new Candy("cherry"), null, new Candy("lemon"), null, new Candy("orange") }
        };
        return boxOfCandy;
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        BoxOfCandy partA = partA();
        check(partA.moveCandyToFirstRow(0) == false);
        check(partA.moveCandyToFirstRow(2) == true);
        check(Arrays.stream(partA.box).flatMap(Arrays::stream).filter(c -> c != null).count() == 5);
        check(partA.box[1][2] == null);
        BoxOfCandy partB = partB();
        check(partB.removeNextByFlavor("cherry").getFlavor().equals("cherry"));
        check(partB.removeNextByFlavor("lime").getFlavor().equals("lime"));
        check(partB.removeNextByFlavor("grape") == null);
        check(Arrays.stream(partB.box).flatMap(Arrays::stream).filter(c -> c != null).count() == 7);
        check(partB.box[1][3] == null);
        check(partB.box[2][0] == null);
        check(partB.box[0][0] != null);

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}
