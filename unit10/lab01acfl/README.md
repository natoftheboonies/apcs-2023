# ACFL Maps

Anacortes Community Forest Lands.

Here are some maps:

- [Friends of the Forest](https://www.friendsoftheacfl.org/maps)
- [City of Anacortes](https://www.anacorteswa.gov/588/Biking-Trail-Maps)

## Setup

Add the included `lib/gson-2.10.1.jar` to the classpath.
In VS Code, that's within "Java Projects" in the bottom-left.
Then open and run Explorer.java.

## What's here?

Let's intepret those maps as machine-readable data, so we can play graphs.

- `trails.js` converts `trails.json` (nodes) into `edges.json` (edges)

But I typed them as YAML, so JSON is just the intermediary. Various [formatters](https://jsonformatter.org/json-to-yaml) convert 'em fine.

First I wrote `trails.yaml` to identify unnamed nodes. But better would be to start with `edges.yml` ...
