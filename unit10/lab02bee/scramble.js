const fs = require("fs");
const puzzle = fs.readFileSync("words_alpha.txt", "utf8");

const words = puzzle.replace(/(\r\n)|\r|\n/g, "\n").split(/\n+/g);
console.log(words.slice(0, 10));
for (let i = words.length - 1; i > 0; i--) {
  const r = Math.floor(Math.random() * (i + 1));
  [words[i], words[r]] = [words[r], words[i]];
}
console.log(words.slice(0, 10));

fs.writeFileSync("words_dropped.txt", words.join("\n"));
