package unit10;

public class Exam {

    public static int fun(int x) {
        if (x < 1)
            return 1;
        else
            return x + fun(x - 1);
    }

    public static int fun2(int x, int y) {
        if (x <= 1)
            return y;
        else
            return fun2(x - 1, y - 1) + y;
    }

    public String weird(String s) {
        if (s.length() >= 10)
            return s;
        return weird(s + s.substring(s.indexOf("lo")));
    }

    private int twokan(int k) {
        if (k == 0)
            return 1;
        return 2 * k + twokan(k - 2);
    }

    public int syrup(int n) {
        if (n < 0)
            return 2;
        else
            return syrup(n - 1) + syrup(n - 3);
    }

    public static int foo(int a, int b) {
        if (a == b)
            return b;
        else
            return a + bar(a - 1, b);
    }

    public static int bar(int p, int q) {
        if (p < q)
            return p + q;
        else
            return p + foo(p - 2, q);
    }

    public static int ben(int[] ray, int i, int x) {
        if (i >= ray.length)
            return 0;
        if (ray[i] == x)
            return 1 + ben(ray, i + 1, x);
        return 0 + ben(ray, i + 1, x);
    }

    public static int fun11a(int x, int y) {
        int ans = 0;
        for (int i = x; i <= y; i++)
            ans = ans + i;
        return ans;
    }

    public static int fun11b(int x, int y) {
        if (x == y)
            return x;
        else
            return x + fun11b(x + 1, y);
    }

    public static int fun11c(int x, int y) {
        if (x == y)
            return x;
        else
            return y + fun11c(x, y - 1);
    }

    public static int fun11d(int x, int y) {
        if (x == y)
            return x;
        else
            return y + fun11d(x + 1, y);
    }

    public int banana(int a, int b) {
        if (b == 0)
            return a;
        else
            return banana(b, a % b);
    }

    public static int apple(int arr[], int n) {
        if (n <= 0)
            return 0;
        return apple(arr, n - 1) + arr[n - 1];
    }

    /**
     * Swaps arr[i] and arr[j] in array arr.
     * Precondition: 0 <= i < arr.length; 0 <= j < arr.length
     */
    static void swap(Object[] arr, int i, int j) {
        Object tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public int binSearch(int[] haystack, int needle) {
        int low = 0;
        int high = haystack.length - 1;
        while (low <= high) {
            System.out.println("iter " + low + " to " + high);
            int mid = (low + high) / 2;
            if (haystack[mid] == needle) {
                return mid;
            } else if (haystack[mid] < needle)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static int someMethod(int[] a, int n, int value) {
        if (n == 0)
            return -1;
        else {
            if (a[n - 1] == value)
                return n - 1;
            else
                return someMethod(a, n - 1, value);
        }
    }

    static int banana2(int a, int b) {
        int holdb = 0;
        while (b != 0) {
            holdb = b;
            b = a % holdb;
            a = holdb;
        }
        return a;
    }

    static int banana3(int a, int b) {
        // for (int i = b; i > 0; i = k % b) {
        for (int i = b; i != 0;) {
            int k = i;
            i = a % i;
            a = k;
        }
        return a;
    }

    public static int mystery(int n) {
        if (n <= 1)
            return 2;
        else
            return 1 + mystery(n - 3);
    }

    public static int mysteryC(int n) {
        return 2 + ((n + 1) / 3);
    }

    static double scoreExam(int points) {
        return 40 * Math.sqrt(points / 71D);
    }

    static int kai(int a, int b) {
        while (true) {
            if (b == 0)
                return a;
            a = a % b;
            if (a == 0)
                return b;
            b = b % a;
        }
    }

    static int ireallywantaforloop(int a, int b) {
        // int tmp;
        // for ( ; ; ) {
        // }
        return a;
    }

    public static void main(String[] args) {
        Exam e = new Exam();
        int[] hay = { 4, 7, 9, 11, 20, 24, 30, 41 };
        System.out.println("q2: " + fun(6));
        System.out.println("q3: " + fun(8));
        System.out.println("q4: " + fun2(2, 8));
        System.out.println("q5: " + e.weird("hello"));
        System.out.println("q7: " + e.syrup(3));
        System.out.println("q9: " + (mystery(17) == mysteryC(17)));
        System.out.println("q11:");
        System.out.println(fun11a(2, 3));
        System.out.println(fun11b(2, 3));
        System.out.println(fun11c(2, 3));
        System.out.println(fun11d(2, 3));
        System.out.println(e.binSearch(hay, 27));

        System.out.println("Bonus: " + foo(5, 3));
        System.out.println(scoreExam(49));
        System.out.println(scoreExam(73));

        // System.out.println("b3: " + banana3(15996751, 3870378));
        // System.out.println("kai " + kai(15996751, 3870378));
        // System.out.println("hi");
        // System.out.println("for " + ireallywantaforloop(15996751, 3870378));
    }

}
