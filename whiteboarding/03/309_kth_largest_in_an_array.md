# 309 - Kth Largest in an Array

Given an `array` of integers and a number `K`, find the `Kth` largest value in the array.
```
Input: Array of integers and an Integer
Output: Integer
```

# Example
```
Input: [3, 1, 6, 4, 9, 8], 3     =>	Output: 6
Input: [1, 9, 5, 3], 1		=>	Output: 9
```
# Constraints
```
Time Complexity: Average O(N)
Auxiliary Space Complexity: Average O(log(N))
```

**Note:** The time and space constraints above represent the average, not worst cases.

# Solution

Perform a Quickselect which is similar to Quicksort combined with a binary search:

* 1) Pick a pivot point to separate the array into two parts
  * a) Those elements greater than the pivot to the right of it
  * b) Those elements less than the pivot to the left of it
  * c) The pivot in its correct position separate
* 2) This can be done in place through swapping elements just like quicksort

* 3) Evaluate the if the pivot **`index`** is the `Kth` value from the end of the array
* 4) If so, return the **`value`** at the pivot **`index`**
* 5) Otherwise
  * a) Recurse over the `left` portion of the array if the pivot **`index`** is **larger** than `K`
  * b) Recurse over the `right` portion of the array if the pivot **`index`** is **smaller** than `K`

# Notes

The naive way would to perform a sort and then access the Kth value from the end of the array. However, this is `O(NlogN)` time complexity.

# Resources

[Kth Smallest/Largest Element in an Unsorted Array on Geeks for Geeks](http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/)

[Quickselect on Wikipedia](https://en.wikipedia.org/wiki/Quickselect)
