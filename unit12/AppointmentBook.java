package unit12;

// 2023 FRQ #1
// https://apcentral.collegeboard.org/media/pdf/ap23-frq-comp-sci-a.pdf#page=3
public class AppointmentBook {

    /**
     * Returns true if minute in period is available for an appointment and returns
     * false otherwise
     * Preconditions: 1 <= period <= 8; 0 <= minute <= 59
     */
    private boolean isMinuteFree(int period, int minute) {
        /* implementation not shown */
        return !_calendar[period][minute];
    }

    /**
     * Marks the block of minutes that starts at startMinute in period and
     * is duration minutes long as reserved for an appointment
     * Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59;
     * 1 <= duration <= 60
     */
    private void reserveBlock(int period, int startMinute, int duration) {
        /* implementation not shown */
        for (int i = startMinute; i < startMinute + duration; i++) {
            _calendar[period][i] = true;
        }

    }

    /**
     * Searches for the first block of duration free minutes during period, as
     * described in
     * part (a). Returns the first minute in the block if such a block is found or
     * returns -1 if no
     * such block is found.
     * Preconditions: 1 <= period <= 8; 1 <= duration <= 60
     */
    public int findFreeBlock(int period, int duration) {
        /* to be implemented in part (a) */

        return -1;
    }

    /**
     * Searches periods from startPeriod to endPeriod, inclusive, for a block
     * of duration free minutes, as described in part (b). If such a block is found,
     * calls reserveBlock to reserve the block of minutes and returns true;
     * otherwise
     * returns false.
     * Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
     */
    public boolean makeAppointment(int startPeriod, int endPeriod,
            int duration) {
        /* to be implemented in part (b) */

        return false;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.

    // false means free, true means reserved
    private boolean[][] _calendar = {
            new boolean[60],
            new boolean[60],
            new boolean[60],
            new boolean[60],
            new boolean[60],
            new boolean[60],
            new boolean[60],
            new boolean[60],
    };

    public void printCalendar() {

        // only periods 2,3,4
        for (int i = 2; i < 5; i++) {
            int cursor = 0;
            while (cursor < _calendar[i].length) {
                boolean booked = _calendar[i][cursor];
                int start = cursor;
                while (cursor < _calendar[i].length && _calendar[i][cursor] == booked) {
                    cursor++;
                }
                System.out.println(i + "\t" + start + "-" + (cursor - 1)
                        + " (" + (cursor - start) + " minutes)\t"
                        + (booked ? "No" : "Yes"));
            }
        }

    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        AppointmentBook book = new AppointmentBook();
        book.reserveBlock(2, 0, 10);
        book.reserveBlock(2, 15, 15);
        book.reserveBlock(2, 45, 5);
        // book.printCalendar();
        check(book.findFreeBlock(2, 15) == 30);
        check(book.findFreeBlock(2, 9) == 30);
        check(book.findFreeBlock(2, 20) == -1);

        book = new AppointmentBook();
        book.reserveBlock(2, 0, 25);
        book.reserveBlock(2, 30, 30);
        book.reserveBlock(3, 15, 26);
        book.reserveBlock(4, 0, 5);
        book.reserveBlock(4, 30, 14);
        check(book.makeAppointment(2, 4, 22) == true);
        check(book.makeAppointment(3, 4, 3) == true);
        check(book.makeAppointment(2, 4, 30) == false);
        System.out.println("Happy Panda! \uD83D\uDC3C");
        book.printCalendar();

    }
}