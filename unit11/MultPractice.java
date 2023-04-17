package unit11;

// 2017 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-frq-2017.pdf#page=8

/**
 * Uh oh, Interface! Nah, it's easy:
 * - Add "implements StudyPractice" to the class,
 * - and implement the two functions (along with whatever else you need).
 */
interface StudyPractice {
    /** Returns the current practice problem. */
    String getProblem();

    /** Changes to the next practice problem. */
    void nextProblem();
}

public class MultPractice {

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        // uncomment the following lines to test your code
        // StudyPractice p1 = new MultPractice(7, 3);
        // check(p1.getProblem().equals("7 TIMES 3"));
        // p1.nextProblem();
        // check(p1.getProblem().equals("7 TIMES 4"));
        // p1.nextProblem();
        // check(p1.getProblem().equals("7 TIMES 5"));
        // p1.nextProblem();
        // check(p1.getProblem().equals("7 TIMES 6"));

        // StudyPractice p2 = new MultPractice(4, 12);
        // p2.nextProblem();
        // check(p2.getProblem().equals("4 TIMES 13"));
        // check(p2.getProblem().equals("4 TIMES 13"));
        // p2.nextProblem();
        // p2.nextProblem();
        // check(p2.getProblem().equals("4 TIMES 15"));
        // p2.nextProblem();
        // check(p2.getProblem().equals("4 TIMES 16"));

        // System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
