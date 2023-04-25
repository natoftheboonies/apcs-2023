package unit11.b;

// convering all the bases <-- nevermind, only base 10 is on the exam! 
// https://en.wikipedia.org/wiki/All_your_base_are_belong_to_us
public class Base {
    public static void main(String[] args) {
        int dec = 123;
        printBases(dec);

        int base = 8;
        String asBase = toBase(dec, base);
        System.out.println(asBase);
        int andBack = fromBase(asBase, base);
        System.out.println(andBack);

    }

    public static String toBase(int number, int base) {
        // convert number to base
        String result = "";
        while (number > 0) {
            int digit = number % base; // 0, 0, 1, 1 -> 1100
            number /= base; // 6, 3, 1, 0
            // System.out.print(digit);
            result = digit + result;
        }
        return result;
        // convert numString to base

    }

    public static int fromBase(String number, int base) {
        // convert number to base
        int result = 0;
        for (String digit : number.split("")) { // 173 -> 1, 7, 3 in base 8
            result = base * result + Integer.parseInt(digit); // 1*8^2 + 7*8^1 + 3*8^0
            // ((0+1)*8+7)*8+3 1*8*8+7*8+3
        }
        return result;
    }

    static void printBases(int dec) {
        System.out.println("decimal\tbinary\thex\toctal");

        System.out.print("" + dec); // == base ?
        System.out.print("\t" + Integer.toBinaryString(dec)); // == base ?
        System.out.print("\t" + Integer.toHexString(dec)); // == base ?
        System.out.println("\t" + Integer.toOctalString(dec)); // == base ?

    }

}
