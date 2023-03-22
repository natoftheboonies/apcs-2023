// build your own maze!
let board = `@..#..
...#..
#..#..
##...$`;

const arr = board.split("\n");
const r = arr.length;
const c = arr[0].length;
const line = arr.join("");
console.log(r, c, line);
