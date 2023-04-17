package unit11;

import java.util.Arrays;

// 2016 FRQ #2
// https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf#page=6

public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        /* to be implemented in part (a) */
    }

    /**
     * Returns true if the description in this log message properly contains
     * keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword) {
        /* to be implemented in part (b) */
        return false; // replace me
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
    // There may be instance variables, constructors, and methods that are not shown

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        LogMessage msg1 = new LogMessage("CLIENT3:security alert - repeated login failures");
        LogMessage msg2 = new LogMessage("Webserver:disk offline");
        LogMessage msg3 = new LogMessage("SERVER1:file not found");
        LogMessage msg4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage msg5 = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage msg6 = new LogMessage("Webserver:error on /dev/disk");
        check(!msg1.containsWord("disk"));
        check(msg2.containsWord("disk"));
        check(!msg3.containsWord("disk"));
        check(msg4.containsWord("disk"));
        check(msg5.containsWord("disk"));
        check(!msg6.containsWord("disk"));

        String[] proper = new String[] { "disk",
                "error on disk",
                "error on /dev/disk disk",
                "error on disk DSK1" };
        check(Arrays.stream(proper).allMatch(s -> new LogMessage("foo:" + s).containsWord("disk")));
        String[] improper = new String[] {
                "DISK",
                "error on disk3",
                "error on /dev/disk",
                "diskette" };
        check(Arrays.stream(improper).allMatch(s -> !new LogMessage("foo:" + s).containsWord("disk")));

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}
