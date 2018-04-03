# Week 2 Pair Interview

# Interpersonal Skills Questions

* 1) Can you walk me through your resume?
* 2) What are you looking for in the next role you take?
* 3) Can you tell me about the project you are most proud of (what hurdles did you have to overcome and what successes did you have)?

HINT: Be sure to describe a specific situation for your answer to this question. In an actual interview, the interviewer will likely only ask you “Can you tell me about the project you are most proud of”. They will not include parts 2 and 3 to that question. We are providing those prompts to give you an idea of what you can show (not tell) the interviewer in your answer.

# Technical Questions

# Pivot Index

Given an array of integers, find the pivot index where the sum of the items to the left equal to the sum of the items to the right.


```
Input: nums { Array }
Output: { Integer }
```
# Example
```
Input: [1, 2, 1, 6, 3, 1] => Output: 3
Input: [5, 2, 7] => Output: ­1
Input: [­1, 3, ­3, 2] => Output: 1
```
# Constraints

```
Time Complexity: O(N)
Auxiliary Space Complexity: O(1)
```

* If there is more than one valid pivot index, return the first one you encounter.

* If there is no valid pivot index, return `-1`.

# Solution
* 1) Calculate the sum of the array and assign that to a `right_sum`
* 2) Initialize `left_sum` to be `0`
* 3) Loop through the array
* 4) Check if subtracting current element from the `right_sum` is equal to the `left_sum`
  * a) If so, return `index` of the current element
  * b) Else:
    * i) Subtract current element from the `right_sum`
    * ii) Add current element to the `left_sum`

# Resources
[Find Pivot Index on Leetcode](https://leetcode.com/problems/find-pivot-index/solution/)

```python
# Python Solution:
def pivot_index(arr):
  left_sum = 0
  right_sum = sum(arr)
  for index in range(len(arr)):
    if right_sum ­ arr[index] == left_sum:
      return index
    else:
      left_sum += arr[index]
      right_sum ­= arr[index]

  return ­1
```
