## Boolean logic HOWTO

From Bell Ringer 6A, some students missed the boolean question. These can be annoying, so here's how a computer might do it (hey look, it's recursion!), which you can replicate:

For expression `(p || q) && !(p && q)`, break it down:

- left: `(p || q)`
- right: `!(p && q)`
- expression: `left && right`

Then construct a truth table for possible `p` and `q`:

| p     | q     | left  | right | expression |
| ----- | ----- | ----- | ----- | ---------- |
| true  | true  | true  | false | false      |
| true  | false | true  | true  | true       |
| false | true  | true  | true  | true       |
| false | false | false | true  | false      |

Now it should be clear when the expression is true/false, which seems always to be the question.

Alternatively, did you learn [De Morgan's laws](https://en.wikipedia.org/wiki/De_Morgan%27s_laws)?

Rule 2, "not (A and B) = (not A) or (not B)" can be applied to the right side:

- right: `!(p && q)` => `!p || !q`

This makes the full expression: `(p || q) && (!p || !q)` Maybe this is easier to understand? "Either p or q is true AND either p or q is not true".

I would still build the truth table.

As did [another programmer I asked](https://photos.app.goo.gl/rPWdoBuTmNfmz8T87).

### More Resources

Here is a [fine tutorial on boolean algerbra](https://ryanstutorials.net/boolean-algebra-tutorial/). Skip the derived operators, and use the "Generate easy expression" button.
