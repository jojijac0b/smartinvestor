# 216 - Lowest Common Ancestor

Given the root node of a binary tree and two distinct values, find the lowest common ancestor. 

```
Input: Root Node, Two Integer Values 
Output: Integer Value of Lowest Common Ancestor
```

# Example

Input: root, 4, 9      	=>	Output: 7
![LowestCommonAncestor](http://res.cloudinary.com/outco-io/image/upload/v1521248026/LowestCommonAncestor.png)


# Constraints
```
Time Complexity: O(N)
Auxiliary Space Complexity: O(N)
```
Integer values of nodes are all distinct. 

# Solution

 1) Perform a tree traversal to find/collect the path to the first node.  
  
    * Place values of the path into an array (e.g., [5, 7, 4])
    
 2) Perform a tree traversal to find/collect the path to the second node. 
 
    * Place values of the path into second array (e.g., [5, 7, 8, 9])
  
 3) Iterate through both path arrays and compare the values. 
 
 4) Return the last matching value. (e.g., return 7)

# Notes 
Facebook technical screen problem

```python

def lowest_common_ancestor(root, a, b):                                                              
    if root is None:                                    
        return                                          
    if root.value == a or root.value == b:              
        return root                                     
    left = lowest_common_ancestor(root.left, a, b)      
    right = lowest_common_ancestor(root.right, a, b)    
    if left and right:                                  
        return root                                     
    elif left and not right:                            
        return left                                     
    elif right and not left:                            
        return right                                    
    else:                                               
        return     

```   
   
# Resources
http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/