package unit11;

// 2022 FRQ #1
// https://apcentral.collegeboard.org/media/pdf/ap22-frq-computer-science-a.pdf#page=3
class Level {
    /**
     * Returns true if the player reached the goal on this level and returns false
     * otherwise
     */
    public boolean goalReached() {
        /* implementation not shown */
        return a;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {
        /* implementation not shown */
        return 100 * b;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
    private boolean a;
    private int b;

    Level(boolean a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean a;

    /** Postcondition: All instance variables have been initialized. */
    public Game(int a, int b) {
        /* implementation not shown */
        this.a = (a & 1) == 1;
        this.levelOne = new Level(((a >> 3) & 1) == 1, b % 10);
        this.levelTwo = new Level(((a >> 2) & 1) == 1, (b / 10) % 10);
        this.levelThree = new Level(((a >> 1) & 1) == 1, (b / 100) % 10);
        this.plays = 0;
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        /* implementation not shown */
        return a;
    }

    /**
     * Simulates the play of this Game (consisting of three levels) and updates all
     * relevant game data
     */
    public void play() {
        /* implementation not shown */
        plays++;
    }

    /**
     * Returns the score earned in the most recently played game, as described in
     * part (a)
     */
    public int getScore() {
        /* to be implemented in part (a) */
        return -1; // delete me!
    }

    /**
     * Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        /* to be implemented in part (b) */
        return -1; // delete me!
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
    int plays;

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        // part a
        Game game = new Game(15, 512);
        check(game.getScore() == 2400);
        game = new Game(12, 512);
        check(game.getScore() == 300);
        game = new Game(11, 512);
        check(game.getScore() == 600);
        game = new Game(6, 512);
        check(game.getScore() == 0);
        System.out.println("Part A Successful!");

        // part b
        game = new GamePartB(new int[] { 75, 50, 90, 20, 50, 112, 88, 30 });
        check(game.playManyTimes(4) == 90);
        System.out.println("Part B Successful!");
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}

class GamePartB extends Game {
    /* Ignore This Class */
    private int[] scores;

    GamePartB(int[] scores) {
        super(1, 1);
        this.scores = scores;
    }

    @Override
    public int getScore() {
        if (plays < scores.length)
            return scores[plays];
        return -1;
    }

}