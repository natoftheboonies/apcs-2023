package unit11;

// 2021 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap21-frq-computer-science-a.pdf#page=8
class SingleTable {
    private int seats;
    private int height;
    private double viewQuality;

    public SingleTable(int seats, int height, double viewQuality) {
        this.seats = seats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
    public int getNumSeats() {
        return this.seats;
    }

    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        return this.height;
    }

    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        return this.viewQuality;
    }

    /** Sets the quality of the view from this table to value. */
    public void setViewQuality(double value) {
        this.viewQuality = value;
    }
}

public class CombinedTable {

    // TODO: implement me!

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        // uncomment block when ready to test. Select, then Ctrl+/
        // SingleTable t1 = new SingleTable(4, 74, 60.0);
        // SingleTable t2 = new SingleTable(8, 74, 70.0);
        // SingleTable t3 = new SingleTable(12, 76, 75.0);
        // CombinedTable c1 = new CombinedTable(t1, t2);
        // check(c1.canSeat(9) == true);
        // check(c1.canSeat(11) == false);
        // check(c1.getDesireability() == 65.0);
        // CombinedTable c2 = new CombinedTable(t2, t3);
        // check(c2.canSeat(18));
        // check(c2.getDesireability() == 62.5);
        // t2.setViewQuality(80);
        // check(c2.getDesireability() == 67.5);
        // System.out.println("Happy Panda! \uD83D\uDC3C");

    }

}