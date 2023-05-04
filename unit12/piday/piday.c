#include <stdio.h>
#include <stdbool.h>

// Nilakantha infinite series for π
// https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
double piDay(long n, bool subtract)
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
    double next = piDay(n + 2, !subtract);

    return term + next;
}

int main()
{
    double pi = 3.0 + piDay(3, false);

    printf("pi = %f\n", pi);

    return 0;
}