# Binary Trees - Merge Binary Trees

#### Prompt

Given two binary trees, imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

#### Examples
Input: root1 {BinaryTreeNode}, root2 {BinaryTreeNode}


	Tree 1                     Tree 2  

          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7   


 Output: root1 {BinaryTreeNode}

    Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7


#### Constraints
Time Complexity: O(N)   
Space Complexity: O(N)   


The merging process must start from the root nodes of both trees.   

#### Resources

[Binary Tree Traversals](http://www.ida.liu.se/opendsa/OpenDSA/Books/TDDD86_2014/html/BinaryTreeTraversal.html)

#### Hints

1. How can you traverse through both trees at the same time?
2. What happens when both nodes you are currently on are none? Or when one of them is none? Or both are not none?

#### Solution

```python
def merge_trees(root1, root2):
  if root1 is not None and root2 is not None:
    root1.value += root2.value
  elif root1 is None:
    return root2
  else:
    return root1
  root1.left = merge_trees(root1.left, root2.left)
  root1.right = merge_trees(root1.right, root2.right)
  return root1
```
