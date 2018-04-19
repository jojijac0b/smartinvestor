# 215 - Valid Binary Search Tree 

Given a binary tree root node, check if the tree is a valid binary search tree.

```
Input: Node in a Binary Tree 
Output: Boolean
```

# Example

Input: 
![ValidBinarySearchTree](http://res.cloudinary.com/outco-io/image/upload/v1521248026/ValidBinarySearchTree.png)

Output: False 

# Constraints
```
Time Complexity: O(N)
Auxiliary Space Complexity: O(N)
```
Binary Tree Node has the following properties: 
1) value
2) Integer Left Child (default null) 
3) Integer Right Child (default null) 

# Solution

1) Perform an in-order depth first search and push values into an array.   
 
2) Check to see whether the array is sorted in ascending order. 
   
                                          
# Resources
https://leetcode.com/problems/validate-binary-search-tree/ 


