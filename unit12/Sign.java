package unit12;

public class Sign {

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {

        // uncomment to test
        // Sign sign1 = new Sign("ABC222DE", 3);
        // check(sign1.numberOfLines() == 3);
        // check(sign1.getLines().equals("ABC;222;DE"));
        // check(sign1.getLines().equals("ABC;222;DE"));
        // Sign sign2 = new Sign("ABCD", 10);
        // check(sign2.numberOfLines() == 1);
        // check(sign2.getLines().equals("ABCD"));
        // Sign sign3 = new Sign("ABCDEF", 6);
        // check(sign3.numberOfLines() == 1);
        // check(sign3.getLines().equals("ABCDEF"));
        // Sign sign4 = new Sign("", 4);
        // check(sign4.numberOfLines() == 0);
        // check(sign4.getLines() == null);
        // Sign sign5 = new Sign("AB_CD_EF", 2);
        // check(sign5.numberOfLines() == 4);
        // check(sign5.getLines().equals("AB;_C;D_;EF"));

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}