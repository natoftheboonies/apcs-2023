const fs = require("fs");

const trailsData = fs.readFileSync("tree.json", "utf8");
const trails = JSON.parse(trailsData);
console.log(trails.length);

// for each trail, generate set of nodes objects
// for each node, add edge (trail segment)
const nodes = new Set();
trails.forEach((trail) => {
  //if (trail.dist == 0) return;
  trail.nodes.forEach((node) => nodes.add(node));
});

//console.log(nodes);
const junctions = new Map(Array.from(nodes).map((node) => [node, []]));

trails.forEach((trail) => {
  if (trail.nodes.length == 2) {
    [a, b] = trail.nodes;
    junctions.get(a).push([trail.trail, b]);
    junctions.get(b).push([trail.trail, a]);
  }
});

//console.log(junctions);

function search(path, start, dist) {
  if (dist <= 0) {
    console.log(path);
  } else {
    const moves = junctions.get(start);
    moves.forEach((move) => {
      if (path.indexOf(move) == -1) {
        const next = path.slice();
        next.push(move);
        search(next, move[1], dist - 1);
      }
    });
  }
}

search(["A1"], "A1", 8);
