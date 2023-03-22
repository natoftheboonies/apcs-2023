import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

public class SpellingBeeKey {

    private char[] letters;

    private char mustUse;

    // TODO construct me!
    public SpellingBeeKey(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    public boolean checkWord(String word) {
        // TODO implement me!
        if (word.length() < 4)
            return false;
        if (word.indexOf(this.mustUse) == -1)
            return false;
        String foo = new String(letters);
        for (char c : word.toCharArray()) {
            if (foo.indexOf(c) == -1)
                return false;
        }
        // System.out.println(foo);
        return true;
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        SpellingBeeKey bee = new SpellingBeeKey("garlnty".toCharArray(), 'y');
        System.out.println(bee.checkWord("gnarly"));
        // TODO sort words!
        // what position in the sorted list is the word "search" ?
        Arrays.sort(words);
        int found = Arrays.binarySearch(words, "search");
        System.out.println("found 'search' at " + found);
        System.out.println(words[found]);

        // TODO solve me!
        // SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
        for (String word : words) {
            if (bee.checkWord(word)) {
                System.out.println(word);
            }
        }

    }
}
