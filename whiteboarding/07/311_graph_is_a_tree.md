# 311 - Graph is a Tree

Given an undirected graph, determine whether or not said graph is a tree.

```
Input: Undirected Graph
Output: Array of integers
```

# Example

```
Input:
```
![GraphIsTree1](http://res.cloudinary.com/outco-io/image/upload/v1520910500/GraphIsTree1.png)

```
Output: True
```
![GraphIsTree2](http://res.cloudinary.com/outco-io/image/upload/c_scale,w_400/v1520910500/GraphIsTree2.png)

```
Input:
```

```
Output: False
```

# Constraints

```
Time Complexity: O(N)
Auxiliary Space Complexity: O(N)
```

The graph `Vertex` has the following properties:

`value` : an integer

`edges` : a list which contains references to other vertices in the `Graph`

You may assume the values of the vertices will all be unique.

# Solution

An undirected graph is a tree if the following two conditions are met:

* 1) There is no cycle among the vertices

* 2) All of the vertices of the graph are connected

To detect a cycle:

* 1) Perform either DFS or BFS through the graph

* 2) For every `vertex`, check to see whether or not there is an adjacent vertex that we have already visited that is not the “parent” of the current `vertex`

  * a) If this check returns `true`, then we know there is a cycle


* 3) If we search through the entire `Graph` and do not return `false`, then we know there is no cycle and can return true

To detect connectivity:

* 1) Perform either DFS or BFS through the graph starting at any vertex

* 2) Check to see whether all the vertices are reachable

* 3) If we can reach every vertex then we know the graph is connected and can return true, otherwise return false

# Resources

[Check if Graph is Tree](http://quiz.geeksforgeeks.org/check-given-graph-tree/)
