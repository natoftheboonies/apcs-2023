package unit10;

public class RecurKey {

    // option 1: make the code print the method/return flow.
    public static int fun3(int n) {
        System.out.println("fun3(" + n + ") called");
        if (n == 0) {
            System.out.println("base case f(0) returns 1");
            return 1;
        } else {
            System.out.println("recursive case f(" + (n - 1) + ")");
            int result = 3 * fun3(n - 1);
            System.out.println("fun3(" + n + ") returns " + result);
            return result;
        }
    }

    // option 2: add a comment describing the flow.
    /*
     * recurive flow for f(6)
     * f(6) returns f(5) + f(4) == 8
     * f(5) returns f(4) + f(3) == 5
     * f(4) returns f(3) + f(2) == 3
     * f(3) returns f(2) + f(1) == 2
     * f(2) returns f(1) + f(0) == 1
     * f(1) returns 1 (base case)
     * f(0) returns 0 (base case)
     * now we fill the answers! ^^
     */
    public static int f(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    public static boolean has(String input) {
        if (input.length() < 2)
            return false;
        return (input.charAt(0) == input.charAt(1) || has(input.substring(1)));
    }

    public static boolean pot(String input) {
        if (input.length() < 2)
            return true;
        return (input.charAt(0) == input.charAt(input.length() - 1)
                && pot(input.substring(1, input.length() - 1)));
    }

    public static double two(int n) {
        if (n < 1)
            return 1.0 / 2;
        return 1.0 / (2 + two(n - 1));
    }

    public static String mop(int n) {
        if (n / 2 == 0)
            return "" + n % 2;
        return mop(n / 2) + n % 2;
    }

    public static int cat(int x) {
        if (x == 0)
            return x;
        return ((x % 10) + cat(x / 10));
    }

    // Fix function mystery so that mystery(10) == 32
    public static int mystery(int x) {
        if (x <= 1)
            return 1;
        // return mystery(x - 1) + mystery(x - 2);
        // return 2 * mystery(x - 2);
        // return 2 * mystery(x - 1);
        // return 4 * mystery(x - 4);
        return 4 + mystery(x - 1);
    }

    public static void main(String[] args) {

        // Consider function fun3
        System.out.println(fun3(5));

        // Consider function f
        System.out.println(f(6));

        // Consider function has
        // System.out.println(has("hello"));
        // System.out.println(has("howdy"));

        // Consider function pot
        // System.out.println(pot("deified"));
        // System.out.println(pot("deepfried"));

        // Consider function two
        // System.out.println(two(6));

        // Consider function mop
        // System.out.println(mop(11));

        // Consider function cat
        // System.out.println(cat(4096));

        // Fix function mystery so that mystery(10) == 32
        // System.out.println(mystery(10));

    }

}
