function puzzlegen() {
  const length = Math.round(Math.random() * 10) + 4;
  const nums = new Array();
  for (let i = 0; i < length; i++) {
    nums.push(Math.round(Math.random() * 10) + 1);
  }

  let sum = nums[0];
  for (let i = 1; i < length; i++) {
    if (Math.random() < 0.5) sum += nums[i];
    else sum -= nums[i];
  }

  console.log("What combination of +/- will solve this sequence?");
  console.log(`int[] puzzle = {${nums.join(", ")} }; int sum = ${sum};`);
}

puzzlegen();
/*
Puzzle: [4, 10, 1, 6, 10, 9, 4, 2]  =  0
my answer: 4 + 10 - 1 - 6 - 10 + 9 - 4 - 2
*/
