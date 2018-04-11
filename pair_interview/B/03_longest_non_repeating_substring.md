# Week 3 Pair Interview

# Interpersonal Skills Questions

STEP 1: Collect and review the job description the interviewee provides you.

STEP 2: Ask the following interview questions.

* 1) Tell me about yourself and why you are a strong fit for our company/this position.*

* 2) Tell me about a time where you were working on project and did not agree with the direction the team wanted to take. What did you do?

* 3) Tell me about a time when you learned from a mistake.

NOTE: the interviewer will likely not ask you why you are a good fit for the company along with “tell me about yourself”, but if anyone asks you “tell me about yourself” you should always end it with why you are a strong fit for company/role and what you can contribute to help solve their problem (your potential). This is a good question to use the present, past, future response technique. If the person you interviewed did not end with why they are a good fit, re-practice this question.


# Technical Questions

# Longest non-Repeating Substring

Given a string, find the length of the longest substring without repeating characters.
```
Input: {String}
Output: {Integer}
```
# Example
```
Input: “abcabcbb” => Output: 3
Input: “bbbbb” => Output: 1
Input: “pwwkew” => Output: 3
```
# Constraints
```
Time Complexity: O(N)
Auxiliary Space Complexity: O(N)
```
# Solution
Essentially a sliding window problem.

* 1) Initialize a hashmap/dictionary/object that will map characters to their index.
* 2) Initialize `start`, `end`, and `answer`
* 3) Loop through the string while `end` is less than `length` of string
* 4) Check if character at `end` is in hashmap
  * a) If so, repeating character exists between `start` and `end`. Set `start` to be the `max` between the value of character in the hashmap, and `start`
* 5) Set `answer` to be `max` between `answer` and length of `end - start`
* 6) Set value at character in hashmap to be `end + 1`
* 7) Increment `end`
* 8) At the end of loop, return `answer`

# Resources

[Longest Substring Without Repeating Characters on Leetcode](https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/)


```python
# Python Solution:
def length_of_longest_substring(s):
  seen = {}
  start = 0
  end = 0
  ans = 0
  while (end < len(s)):
    char = s[end]
    if char in seen:
      start = max(seen[char], start)
    ans = max(ans, end ­ start + 1)
    seen[char] = end + 1
    end += 1
  return ans
```

Copyright © 2017 Outco Inc.
