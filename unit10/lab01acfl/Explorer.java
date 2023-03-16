import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

class TrailLoader {
    private TrailLoader() {
    }

    /**
     * Reads from tree.json into ArrayList<TrailSegment>
     */
    private static ArrayList<Edge> readJsonList(String filename) {

        String sample = "[{\"trail\": 210,\"dist\": 0.1, \"note\": \"junction 23 in middle\", \"nodes\": [\"E6\", \"F6\"]}]";

        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());

            sample = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // Using Gson instructions:
        // https://github.com/google/gson/blob/master/UserGuide.md#collections-examples
        Gson gson = new Gson();
        ArrayList<Edge> segments = gson.fromJson(
                sample, new TypeToken<ArrayList<Edge>>() {
                });
        System.out.println("Loaded " + segments.size() + " segments.");
        return segments;
    }

    static HashMap<String, ArrayList<Edge>> initialize(String filename) {
        // read json into objects
        ArrayList<Edge> segments = readJsonList(filename);

        // from segments, find junctions as a set (eliminates duplicates)
        HashSet<String> junctions = new HashSet<String>();
        segments.forEach((segment) -> junctions.addAll(Arrays.asList(segment.getJunctions())));

        // build a map of junctions (nodes) and their trails
        HashMap<String, ArrayList<Edge>> nodeTrails = new HashMap<String, ArrayList<Edge>>();
        // initialize map from the junction list
        junctions.forEach((node) -> nodeTrails.put(node, new ArrayList<Edge>()));
        // update map from our list of segments
        segments.forEach((segment) -> {
            for (String node : segment.getJunctions()) {
                nodeTrails.get(node).add(segment);
            }
        });
        return nodeTrails;
    }
}

/**
 * Represents a trail segment, with a trail name and distance, between two
 * junctions.
 * For example: trail 241 between A1 and C4 is 0.51 miles.
 */
class Edge {

    private String trail;
    private double dist;

    private String note;
    private String[] nodes;

    /**
     * Returns the note from our input data. Not used.
     */
    public String getNote() {
        return note;
    }

    /**
     * The junctions of this trail segment, e.g. {"A1", "C4"} for trail 241 in the
     * top left of the map.
     * Arrays are ordered, but the order is not important.
     */
    protected String[] getJunctions() {
        return nodes;
    }

    Edge(String trail, double dist, String note, String[] nodes) {
        this.trail = trail;
        this.dist = dist;
        this.note = note;
        this.nodes = nodes;
    }

    /**
     * The distance for this trail segment, in miles.
     */
    public double getDist() {
        return dist;
    }

    /**
     * The trail name for this segment. For example, "126"
     */
    public String getTrail() {
        return trail;
    }

    public String toString() {
        return "Trail " + trail + " (" + dist + ") junctions " + Arrays.toString(nodes);
    }

    public boolean equals(Object other) {
        if (other instanceof Edge) {
            Edge otherEdge = (Edge) other;
            return this.trail.equals(otherEdge.trail) && this.dist == otherEdge.dist
                    && this.nodes.equals(otherEdge.nodes);
        }
        return false;
    }

}

/**
 * Represents our map, providing access to the trail segments.
 */
class TrailMap {

    private HashMap<String, ArrayList<Edge>> trails;

    public TrailMap(String filename) {
        this.trails = TrailLoader.initialize(filename);
    }

    /**
     * Access method to the map of trail segments for a junction.
     * 
     * @param junction from which to find trails, e.g. "C4"
     * @return the trail segments departing from a junction
     */
    public ArrayList<Edge> getTrails(String junction) {
        return trails.get(junction);
    }

    /**
     * Helper method to extract the neighboring junctions for a specified junction.
     * For example, junction C4 has trail segments to A1, D4, and B7
     * 
     * @param junction from which to find neighbors, e.g. "C4"
     * @return array of junctions accessible by trail segments departing from
     *         junction
     */
    public String[] getNeighbors(String junction) {
        ArrayList<String> junctions = new ArrayList<String>();
        for (Edge trail : this.getTrails(junction)) {
            for (String j : trail.getJunctions()) {
                if (!j.equals(junction))
                    junctions.add(j);
            }
        }
        return junctions.toArray(new String[junctions.size()]);
    }

    /**
     * Helper function to find the trail segment (Edge) from junction "start" to
     * "end"
     * Since trails are bidirectonal, swapping start and end will find the same
     * trail.
     * 
     * @param start one end of the trail segment to find.
     * @param end   one end of the trail segment to find.
     * @return the trail segment from start to end.
     */
    public Edge getTrail(String start, String end) {
        for (Edge edge : this.getTrails(start)) {
            if (Arrays.asList(edge.getJunctions()).contains(end)) {
                return edge;
            }
        }
        return null;
    }

}

public class Explorer {

    public static TrailMap map;

    /**
     * Hint: pass a copy of "path" with each recursive call.
     * https://stackoverflow.com/questions/6536094/java-arraylist-copy
     * 
     * @param path  a list of junctions visited
     * @param steps the number of steps left to hike.
     */
    public static void explore(ArrayList<String> path, int steps) {
        // TODO build a recursive function

    }

    public static void main(String[] args) {
        map = new TrailMap("edges.json");
        System.out.println(map.getTrails("A1"));
        // Where can you explore?
        System.out.println(Arrays.toString(map.getNeighbors("C4")));
        System.out.println(map.getTrail("C4", "B7"));
        System.out.println(map.getTrail("B7", "C4"));

        // where can you get in 8 steps? use map.getNeighbors
        ArrayList<String> path = new ArrayList<String>();
        path.add("A1");
        explore(path, 8);

        // how far is that?

        // can you get from A1 to B21?

        // choose your own adventure!

    }
}