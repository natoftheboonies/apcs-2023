using System;

public class PiDay
{
    // Nilakantha infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
    public static double PiDay(long n, bool subtract)
    {
        // base case
        if (n > 5000)
        {
            return 0.0;
        }

        // recursive case
        double term = 4.0 / ((n - 1) * n * (n + 1));
        if (subtract)
        {
            term *= -1.0;
        }

        // n+2 brings n closer to base case
        double next = PiDay(n + 2, !subtract);

        return term + next;
    }

    public static void Main()
    {
        double pi = 3.0 + PiDay(3, false);

        Console.WriteLine("pi = " + pi);
    }
}