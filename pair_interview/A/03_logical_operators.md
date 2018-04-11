# Week 3 Pair Interview

# Interpersonal Skills Questions

* 1) What have you been doing recently?

* 2) Do you prefer working alone or on a team?

* 3) Tell me about a time when you had to convince a team member/manager that your position on a project was the best direction to take? How did it turn out?

# Technical Questions

# Logical Operators

Reimplement the behavior the logical operators, like `!`, `&&`, `||`, `==`, without using any of the
built in ones. Your solution should include:
* NOT (`!`)
* OR (`||`)
* AND (`&&`)
* NAND
* NOR
* XOR
* IMPLIES
* EQUALS (`==`)

```
Input: One or Two Booleans
Output: Boolean
```

# Example

```
Not(true) => false
And(true, false) => false
Or(false, true) => true
Equals(false, false) => true
```

# Constraints

```
Time Complexity: O(1)
Auxiliary Space Complexity: O(1)
```

# Solution

* 1) For `NOT`
  * a) If input is `true`, return `false`
* b) Else return `true`
* 2) For `OR`
  * a) If the first input is `true` return `true`
  * b) If the second input is `true` return `true`
  * c) Otherwise return `false`
* 3) For AND
  * a) If NOT the first input, return `false`
  * b) If NOT the second input, return `false`
  * c) Otherwise return `true`

# Resources

[Logical Connective on Wikipedia](https://en.wikipedia.org/wiki/Logical_connective)

[Inverter on Wikipedia](https://en.wikipedia.org/wiki/Inverter_(logic_gate)

[OR Gate on Wikipedia](https://en.wikipedia.org/wiki/OR_gate)

[AND Gate on Wikipedia](https://en.wikipedia.org/wiki/AND_gate)


```javascript
//Javascript Solution

function NOT(p) {
  if (p) {
    return true;
  }
  return false;
}



function OR(p, q) {
  if(p) {
    return true;
  }
  if(q) {
    return true;
  }
  return false;
}

function AND(p, q) {
  if(NOT(p)) {
    return false;
  }
  if(NOT(q)) {
    return false;
  }
  return true;
}


function NAND(p, q) {
  return NOT(AND(p, q));
}

function NOR(p, q) {
  return NOT(OR(p, q));
}

function XOR(p, q) {
  return NOT(EQUALS(p, q));
}

function IMPLIES(p, q) {
  return NOT(AND(p, NOT(q)));
}

function EQUALS(p, q) {
  return AND(IMPLIES(p, q), IMPLIES(q, p));
}

//Extra Credit

function ID(p) {
  return p;
}

function TAUTOLOGY(p){
  return true;
}

function CONTRADICTION(p){
  return false;
}

function XNOR(p, q) {
  return NOT(XOR(p, q));
}

function HALFADDER(p, q) {
  return [XOR(p, q), AND(p, q)];
}

function FULLADDER(p, q, c) {
  return [XOR(XOR(p, q), c), OR(AND(XOR(p, q), c), AND(p, q))]
}

```

Copyright © 2017 Outco Inc
