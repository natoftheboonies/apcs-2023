package unit11.b;

// convering all the bases
// https://en.wikipedia.org/wiki/All_your_base_are_belong_to_us
public class Base {
    public static void main(String[] args) {
        int dec = 1;
        printBases(dec);
    }

    // can you write your own functions that work like Integer.to____String?
    static void printBases(int dec) {
        System.out.println("decimal\tbinary\thex\toctal");

        System.out.print("" + dec); // == base ?
        System.out.print("\t" + Integer.toBinaryString(dec)); // == base ?
        System.out.print("\t" + Integer.toHexString(dec)); // == base ?
        System.out.println("\t" + Integer.toOctalString(dec)); // == base ?
    }

}
