package unit10;

import java.util.ArrayList;

public class Baum {
    private String label;
    private ArrayList<Baum> children;

    public Baum(String label) {
        this.label = label;
        this.children = new ArrayList<Baum>();
    }

    public void addChild(Baum child) {
        this.children.add(child);
    }

    public String getLabel() {
        return label;
    }

    public ArrayList<Baum> getChildren() {
        return children;
    }

    static Baum filesystemTree() {
        // see The Recursive Book of Recursion, Figure 2-6:
        // https://inventwithpython.com/recursion/chapter2.html#calibre_link-445
        Baum root = new Baum("C:/");
        Baum bacon = new Baum("bacon");
        Baum eggs = new Baum("eggs");
        root.addChild(bacon);
        root.addChild(eggs);
        Baum fizz = new Baum("fizz");
        bacon.addChild(fizz);
        fizz.addChild(new Baum("spam.txt"));
        eggs.addChild(new Baum("spam.txt"));
        bacon.addChild(new Baum("spam.txt"));
        root.addChild(new Baum("spam.txt"));
        return root;
    }

    public static void main(String[] args) {
        Baum fsTree = filesystemTree();
    }

}
