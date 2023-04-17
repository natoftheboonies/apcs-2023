package unit11;

import java.util.ArrayList;
import java.util.Arrays;

// 2022 FRQ #3
// https://apcentral.collegeboard.org/media/pdf/ap22-frq-computer-science-a.pdf#page=10
class Review {
    private int rating;
    private String comment;

    /**
     * Precondition: r >= 0
     * c is not null.
     */
    public Review(int r, String c) {
        rating = r;
        comment = c;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}

public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
        /* implementation not shown */ }

    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
        /* to be implemented in part (a) */
        return -1; // replace me!
    }

    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
        /* to be implemented in part (b) */
        return null; // replace me!
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        Review[] reviews = { new Review(4, "Good! Thx"), new Review(3, "OK site"), new Review(5, "Great!"),
                new Review(2, "Poor! Bad."), new Review(3, "")
        };
        ReviewAnalysis analysis = new ReviewAnalysis(reviews);
        // part a
        check(analysis.getAverageRating() == 3.4);

        // part b
        ArrayList<String> comments = analysis.collectComments();
        String[] target = new String[] { "0-Good! Thx.", "2-Great!", "3-Poor! Bad." };
        check(Arrays.equals(comments.toArray(new String[comments.size()]), target));

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}
