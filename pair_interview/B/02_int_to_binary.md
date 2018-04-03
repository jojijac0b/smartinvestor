# Week 2 Pair Interview

# Interpersonal Skills Questions

* 1) Tell me about yourself.

* 2) What is your strongest coding language and why?

* 3) You are being brought into this role to take over an existing project. What will you do in the first
week to hit the ground running and make sure there there are no project delays during this
change of hands?

# Technical Questions

# Decimal to Binary

Given an integer in base `10`, return its value as a string in binary (aka base `2`)
```
Input: int { Integer }
Output: { String }
```
# Example

```
Input: 5 => Output: “101”
Input: 39 => Output: “100111”
Input: 157 => Output: “10011101”
```

# Constraints
```
Time Complexity: O(log N)
Auxiliary Space Complexity: O(log N)
```
# Solution
* 1) Figure out the highest power of two that is less than the input integer

* 2) Create a loop that runs while the input is greater than `0`

  * a) If the current power of two is less than or equal to the integer

    * i) Subtract that power of two from the integer

    * ii) Concatenate `1` to the result string

  * b) Otherwise

    * i) Concatenate `0` to the result string


* 3) Return the result string

# Resources
[Decmial to Binary on Stackoverflow](https://stackoverflow.com/questions/14784630/converting-decimal-to-binary-java)


```javascript
//JavaScript Solution:

function toBinary(int) {
  let exponent = 0;
  let result = '';
  while (Math.pow(2, exponent) * 2 < int) {
    exponent++;
  }
  while(int > 0) {
    let num = Math.pow(2, exponent);
    if(int >= num) {
      int -= num;
      result += 1
    } else {
      result += 0;
    }
    exponent- ;
  }
  return result;
}
```

Copyright © 2017 Outco Inc.
