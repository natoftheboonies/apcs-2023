package unit12;

import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    /**
     * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper) {
        /* to be implemented in part (a) */
    }

    /**
     * Returns the length of the longest heat wave found in temperatures, as
     * described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on
     * threshold.
     */
    public int longestHeatWave(double threshold) {
        /* to be implemented in part (b) */
        return -1; // replace me!
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
    WeatherData(double[] temps) {
        temperatures = new ArrayList<Double>();
        for (double temp : temps) {
            temperatures.add(temp);
        }
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        double[] temps = { 99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5 };
        WeatherData data = new WeatherData(temps);
        data.cleanData(85.0, 120.0);
        check(data.temperatures.size() == 7);
        check(data.temperatures.stream().noneMatch(d -> d.doubleValue() > 120 && d.doubleValue() < 85));
        temps = new double[] { 100.5, 98.5, 102.0, 103.9, 87.5, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2 };
        WeatherData part2 = new WeatherData(temps);
        check(part2.longestHeatWave(100.5) == 3);
        check(part2.longestHeatWave(95.2) == 4);
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
