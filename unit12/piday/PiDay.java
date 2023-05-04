package unit12.piday;

public class PiDay {

    // Nilakantha infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
    public static double piDay(long n, boolean subtract) {
        // base case
        if (n > 5000) {
            return 0;
        }

        // recursive case
        double term = 4.0 / ((n - 1) * n * (n + 1));
        if (subtract) {
            term *= -1;
        }
        // n+2 brings n closer to base case
        double next = piDay(n + 2, !subtract);

        return term + next;
    }

    public static void main(String args[]) {
        double pi = 3.0 + piDay(3, false);

        System.out.println("pi = " + pi);
    }
}
