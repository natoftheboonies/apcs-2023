package unit11;

import java.util.Arrays;
import java.util.List;

// 2016 FRQ #4
// https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf#page=18
public class StringFormatter {

    /**
     * Returns the total number of letters in wordList.
     * Precondition: wordList contains at least two words, consisting of letters
     * only.
     */
    public static int totalLetters(List<String> wordList) {
        // TODO part (a)
        return -1; // replace me!
    }

    /**
     * Returns the basic gap width when wordList is used to produce
     * a formatted string of formattedLen characters.
     * Precondition: wordList contains at least two words, consisting of letters
     * only.
     * formattedLen is large enough for all the words and gaps.
     */
    public static int basicGapWidth(List<String> wordList,
            int formattedLen) {
        // TODO part (b)
        return -1; // replace me!
    }

    /**
     * Returns a formatted string consisting of the words in wordList separated by
     * spaces.
     * Precondition: The wordList contains at least two words, consisting of letters
     * only.
     * formattedLen is large enough for all the words and gaps.
     * Postcondition: All words in wordList appear in the formatted string.
     * - The words appear in the same order as in wordList.
     * - The number of spaces between words is determined by basicGapWidth and the
     * distribution of leftoverSpaces from left to right, as described in the
     * question.
     */
    public static String format(List<String> wordList, int formattedLen) {
        // TODO part (c)
        return ""; // replace me!
    }

    /**
     * Returns the number of leftover spaces when wordList is used to produce
     * a formatted string of formattedLen characters.
     * Precondition: wordList contains at least two words, consisting of letters
     * only.
     * formattedLen is large enough for all the words and gaps.
     */
    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        /* implementation not shown */
        int totalLetters = totalLetters(wordList);
        int totalSpaces = wordList.size() - 1;
        return (formattedLen - totalLetters) % totalSpaces;

    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList(new String[] { "GREEN", "EGGS", "AND", "HAM" });
        check(format(wordList, 20).equals("GREEN  EGGS  AND HAM"));
        wordList = Arrays.asList(new String[] { "AP", "COMP", "SCI", "ROCKS" });
        check(format(wordList, 20).equals("AP  COMP  SCI  ROCKS"));
        wordList = Arrays.asList(new String[] { "BEACH", "BALL" });
        check(totalLetters(wordList) == 9);
        check(basicGapWidth(wordList, 20) == 11);
        check(format(wordList, 20).equals("BEACH           BALL"));

        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
