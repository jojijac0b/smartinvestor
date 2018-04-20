# Week 4 Pair Interview

# Interpersonal Skills Questions

STEP 1: Collect and review the job description the interviewee provides you.

STEP 2: Ask the following interview questions.
* 1) In 1-3 minutes, can you walk me through your resume?

* 2) Give an example of a goal you reached and tell me how you achieved it.

* 3) Tell me about a time you worked effectively under pressure.

* 4) Do you listen - give an example of when you did or when you did not listen.

NOTE: this answer should always end with you speaking about how you can provide value to
the company/position.


# Technical Questions

# Unique Binary Search Trees

Given `n`, how many structurally unique BSTs (binary search trees) that store values `1` through `n`?
```
Input: {Integer}
Output: {Integer}
```
# Example
```
Input: 3

1        3     2     1          3
 \      /     / \     \        /
  3    2     1   3     2      1
 /    /                 \      \
2    1                   3      2

Output: 5
```
# Constraints
```
Time Complexity:
Intermediate: O(N^2); Advanced: O(N)

Auxiliary Space Complexity:
Intermediate: O(N); Advanced: O(1)
```

# Solution

Intermediate Solution:

* 1) Create an array that is `n + 1` elements long.

* 2) Set the zeroth and first value in the array to be `1`.

* 3) Create an outer loop with an iterator `i` that represents the root from `2` to `n + 1`.

* 4) Create an inner loop with another iterator `j`, that represents the number of unique binary
search trees formed from the left and right subtrees, with respect to root `i`.

* 5) Calculate each value in the ith index of the array as the product of having `j - 1` nodes (left
subtree) and `i - j` nodes (right subtree). With each iteration of `j`, be sure to add the new
product to the value.

* 6) Return the value at the nth index of the array.

# Resources

[Intermediate Solution on Leetcode](https://discuss.leetcode.com/topic/5673/dp-problem-10-lines-with-comments)

[Advanced Solution on Leetcode](https://discuss.leetcode.com/topic/19670/python-solutions-dp-catalan-number)


```python
# Python Solution

# Intermediate (using dynamic programming):
def unique_bst(n):
  num_of_bst = [0] * (n + 1)
  num_of_bst[0] = num_of_bst[1] = 1

  for i in range(2, n + 1):
    for i in range(1, i + 1):
      num_of_bst[i] += num_of_bst[j ­ 1] * num_of_bst[i ­ j]

  return num_of_bst[n]

# Advanced (using the Catalan formula):
def unique_bst(n):
  ans = math.factorial(2*n)/(math.factorial(n)*math.factorial(n+1))
  return ans
```

Copyright © 2017 Outco Inc.
