package unit11;

// 2018 FRQ #1
// https://secure-media.collegeboard.org/apc/ap18-frq-computer-science-a.pdf#page=3
public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /**
     * Constructs a FrogSimulation where dist is the distance, in inches, from the
     * starting
     * position to the goal, and numHops is the maximum number of hops allowed to
     * reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int[] hopList;
    private int hopIdx;
    private int leapCount = 0;

    void setHops(int[] hops) {
        this.hopList = hops;
        this.hopIdx = 0;
    }

    int _leapCount() {
        return this.leapCount;
    }

    /**
     * Returns an integer representing the distance, in inches, to be moved when the
     * frog hops.
     */
    private int hopDistance() { /* implementation not shown */
        if (hopList == null) {
            this.leapCount++;
            return (int) (Math.random() * 10);
        }
        if (hopIdx < hopList.length)
            return hopList[hopIdx++];
        return 0;
    }

    /**
     * Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the
     * simulation;
     * false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        return false; // replace me!
    }

    /**
     * Runs num simulations and returns the proportion of simulations in which the
     * frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        return -1; // replace me!
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setHops(new int[] { 5, 7, -2, 8, 6 });
        check(sim.simulate() == true);

        sim = new FrogSimulation(24, 5);
        sim.setHops(new int[] { 6, 7, 6, 6 });
        check(sim.simulate() == true);

        sim = new FrogSimulation(24, 5);
        sim.setHops(new int[] { 6, -6, 31 });
        check(sim.simulate() == true);

        sim = new FrogSimulation(24, 5);
        sim.setHops(new int[] { 4, 2, -8, });
        check(sim.simulate() == false);

        sim = new FrogSimulation(24, 5);
        sim.setHops(new int[] { 4, 4, 2, 4, 3 });
        check(sim.simulate() == false);

        sim = new FrogSimulation(23, 5);
        double fraction = sim.runSimulations(400);
        check(fraction < 1.0 && fraction > 0.0);
        check(sim._leapCount() <= 400 * 5 && sim._leapCount() > 400);

        System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}