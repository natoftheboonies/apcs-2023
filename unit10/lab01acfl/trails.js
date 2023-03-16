const fs = require("fs");

const trailsData = fs.readFileSync("trails.json", "utf8");
const trails = JSON.parse(trailsData);
console.log(trails.intersections.length);

const edges = new Map();

trails.intersections.forEach((junction) => {
  const node = junction.node;
  if (isNaN(junction.trails)) {
    junction.trails.forEach((trail) => {
      edges.set(trail, (edges.get(trail) ?? []).concat(node));
    });
  } else {
    const trail = junction.trail;
    edges.set(trail, (edges.get(trail) ?? []).concat(node));
  }
});

console.log(edges.get(23));
const edgesOut = new Array();
edges.forEach((nodes, trail) => {
  const nodesSet = new Set(nodes);
  edgesOut.push({ trail, dist: 0, nodes: Array.from(nodesSet) });
});

fs.writeFileSync("edges.json", JSON.stringify(edgesOut));
