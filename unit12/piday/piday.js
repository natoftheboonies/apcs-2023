function piDay(n, subtract = false) {
  // base case
  if (n > 5000) {
    return 0.0;
  }

  // recursive case
  let term = 4.0 / ((n - 1) * n * (n + 1));
  if (subtract) {
    term *= -1.0;
  }

  // n+2 brings n closer to base case
  const next = piDay(n + 2, !subtract);

  return term + next;
}

function main() {
  const pi = 3.0 + piDay(3);

  console.log("pi = " + pi);
}

main();
