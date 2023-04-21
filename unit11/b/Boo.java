
package unit11.b;

// 👻👻👻
// https://www.livescience.com/26697-are-ghosts-real.html
public class Boo {

    public static void main(String[] args) {
        print2();
    }

    public static boolean is2True(boolean a, boolean b) {
        return a && b;
        // return !(a || b);
        // return !a && !b;
        // return !(a && b);
        // return !(a != b) || a && !b;
        // return !(a != 5 && b <= 0)
    }

    public static boolean is3True(boolean a, boolean b, boolean c) {
        return (a && b) || !(b || c);
    }

    public static void print2() {
        boolean a, b;
        a = b = true;
        System.out.println("a\tb\tis2True");
        System.out.println("-----\t-----\t-----");
        for (int i = 0; i < 4; i++) {
            System.out.println(a + "\t" + b + "\t" + is2True(a, b));
            if (i % 2 == 0)
                a = !a;
            b = !b;
        }
    }

    public static void print3() {
        boolean a, b, c;
        a = b = c = true;
        System.out.println("a\tb\tc\tis3True");
        for (int i = 0; i < 8; i++) {
            System.out.println(a + "\t" + b + "\t" + c + "\t" + is3True(a, b, c));
            if (i % 2 == 0)
                a = !a;
            if (i % 4 == 0)
                b = !b;
            c = !c;
        }
    }

}
