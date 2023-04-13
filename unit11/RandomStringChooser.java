package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2016 FRQ #1
// https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf#page=2

public class RandomStringChooser {
    // TODO part a

    static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        // Uncomment the following lines to test your code: select and Ctrl+/
        // String[] wordArray = { "wheels", "on", "the", "bus" };
        // RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        // for (int k = 0; k < 6; k++) {
        // String next = sChooser.getNext();
        // System.out.print(next + " ");
        // if (k < 4)
        // check(Arrays.stream(wordArray).anyMatch(next::equals));
        // else
        // check(next.equals("NONE"));

        // }
        // System.out.println();

        // String word = "cat";
        // RandomLetterChooser letterChooser = new RandomLetterChooser(word);
        // for (int k = 0; k < 4; k++) {
        // String next = letterChooser.getNext();
        // System.out.print(next);
        // if (k < 3)
        // check(word.indexOf(next) != -1);
        // else
        // check(next.equals("NONE"));
        // }
        // System.out.println();
        // System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}

class RandomLetterChooser extends RandomStringChooser {

    /**
     * Constructs a random letter chooser using the given string str.
     * Precondition: str contains only letters.
     */
    public RandomLetterChooser(String str) {
        // TODO part b
    }

    /**
     * Returns an array of single-letter strings.
     * Each of these strings consists of a single letter from str. Element k
     * of the returned array contains the single letter at position k of str.
     * For example, getSingleLetters("cat") returns the
     * array { "c", "a", "t" }.
     */
    private static String[] getSingleLetters(String str) { /* implementation not shown */
        return str.split("");
    }
}