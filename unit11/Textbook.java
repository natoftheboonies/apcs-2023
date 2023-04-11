package unit11;

// 2022 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap22-frq-computer-science-a.pdf#page=8
class Book {
    /** The title of the book */
    private String title;
    /** The price of the book */
    private double price;

    /** Creates a new Book with given title and price */
    public Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
        /* implementation not shown */ }

    /** Returns the title of the book */
    public String getTitle() {
        return title;
    }

    /** Returns a string containing the title and price of the Book */
    public String getBookInfo() {
        return title + "-" + price;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}

// TODO write class Textbook

class TextbookRun {

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        // uncomment block when ready to test. Select, then Ctrl+/

        // Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        // Textbook bio2019 = new Textbook("Biology", 39.75, 3);
        // check(bio2019.getEdition() == 3);
        // check(bio2019.getBookInfo().equals("Biology-39.75-3"));
        // check(bio2019.canSubstituteFor(bio2015));
        // check(!bio2015.canSubstituteFor(bio2019));
        // Textbook math = new Textbook("Calculus", 45.25, 1);
        // check(!bio2015.canSubstituteFor(math));
        // System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}