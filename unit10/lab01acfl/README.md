# ACFL Maps

Anacortes Community Forest Lands.

Here are some maps:

- [Friends of the Forest](https://www.friendsoftheacfl.org/maps)
- [City of Anacortes](https://www.anacorteswa.gov/588/Biking-Trail-Maps)

## Setup

Verify the included `lib/gson-2.10.1.jar` to the classpath. [What's Gson?](https://github.com/google/gson)

- In VS Code, that's within "Java Projects" in the bottom-left.

Then open and run `Explorer.java`.

## What's here?

Let's intepret those maps as machine-readable data, so we can play graphs.

The detritus files are my journey to get here.

- First I wrote `trails.yaml` as that seemed like the right thing to do (Narrator: it wasn't.)
- `trails.js` is a small javascript program which converts `trails.json` (nodes) into `edges.json` (edges). An "edge" represents a trail, but not yet a segment of a trail.
- Then I converted (Various [formatters](https://jsonformatter.org/json-to-yaml) online) `edges.json` to `edges.yml` so I could edit it. YAML is easier to type than JSON.
- I updated `edges.yml` to contain segments, between 2 junctions/nodes/intersections, and added the distance, and occasionally a note.
- Back to the online formatter, I converted `edges.yml` to `tree.json`
- Finally, I wrote `tree.js` which loads `tree.json` and explores it, in order to find problems with the data (like trails that don't connect). One issue I remember was that I didn't link up the 210 trail down at B/C-7.

And now `tree.json` is ready to explore in class!
