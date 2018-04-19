# 213 - Longest Path of a Binary Tree

Given a binary tree node, return the number of nodes in the longest path between the root and a leaf node 

```
Input: Node in a Binary Tree 
Output: Integer
```

# Example
```
Input: <BSTNode 1> =>   Output: 3 (from path 1--> 3--> 4)     
```

![LongestPathBinaryTree](http://res.cloudinary.com/outco-io/image/upload/v1521248026/LongestPathBinaryTree.png)

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

1) Create a scope variable called `max` to keep an integer of the longest path.  
  
2) Create a recursive helper method called `search` that takes in a node and length of the path.  
 
    a) The base case is if the node is null.  
     
    b) Otherwise update `max` if the length of the path is larger than max, perform a recursive case for both the left and right child with the length incremented by 1.  
    
3) Invoke the `search` method with the root node and a length of 1.  
 
4) When the search is complete, return the `max` count.  
 
5) Return the `max count`  

# Notes

Onsite whiteboarding question for Google (2016).

```javascript

// JavaScript Solution:

function longestPath(root) {
    var max = 0;
    function search(node, length) {
        if(!node){ return; }
        max = Math.max(max, length);
        search(node.left, length + 1);
        search(node.right, length + 1);
    }
    search(root, 1);
    return max;
}

```
# Resources
https://leetcode.com/problems/maximum-depth-of-binary-tree/
