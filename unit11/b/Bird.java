package unit11.b;

// 🐦🐦🐦
// https://birdsarentreal.com/
public class Bird {
    public static void main(String[] args) {

        String s = "turkey";
        // predict before uncommenting
        // System.out.println(s.substring(1, 4));

        String t = new String("turkey");
        // System.out.println(s == t);

        int x = 3 % 7;
        // System.out.println(x);

        String w = "ans: " + 4 + 5;
        // System.out.println(w);

        int num1 = 0;
        int num2 = 3;
        while ((num2 != 0) && ((num1 / num2) >= 0)) {
            num1 = num1 + 2;
            num2 = num2 - 1;
        }
        // predict before uncommenting
        // System.out.println(num1 + ", " + num2);

        // what will recur do?
        // recur(7);
    }

    private static void recur(int n) {
        if (n != 0) {
            recur(n - 2);
            System.out.print(n + " ");
        }
    }

    // precondition: arr is not empty, and may have negative values
    // https://www.khanacademy.org/math/cc-sixth-grade-math/cc-6th-negative-number-topic/x0267d782:ordering-rational-numbers/a/ordering-negative-numbers
    private int smallest(int[] arr, int n) {
        // return smallest value in arr less than n
        // what is the smallest integer?
        return n; // replace me
    }
}
