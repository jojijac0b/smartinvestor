# 210 - Queue with Two Stacks

Implement a `Queue` class using two `stacks`. The `Queue` should have the following methods:

`enqueue`: add an item to the end of the collection

`dequeue`: remove an item from the beginning of the collection

```
Input: 		N/A
Output: 	Queue Class
```

# Example

```javascript
enqueue(1)
enqueue(2)
enqueue(3)
dequeue() // => 1
```
# Constraints
```
enqueue:   Time Complexity: O(1),	Auxiliary Space Complexity: O(1)
dequeue:   Time Complexity: O(N),	Auxiliary Space Complexity: O(1)
```

* 1) May not use other data structures other than the two Stacks that are given
* 2) Assume the queue will only take integer values
* 3) May use up to two instances of the Stack class
* 4) Stack class has the following methods:

	`push`: add an item to the end of the collection

	`pop`: remove an from the end of the collection

	`size`: return the number of items in the stack

# Solution

* 1) Create two `stacks` named `inbox` and `outbox`
* 2) For the `enqueue` method, `push` the value into the `inbox`
* 3) For the `dequeue` method, check the to see if the `outbox` contains items
* 4) If the `outbox` contains items, `pop` from the `outbox` and return its value
* 5) Otherwise for each item in the `inbox`, `pop` it out and `push` it into the `outbox`, then perform Step 4.

# Notes

Extremely helpful to diagram out the two stacks from the beginning.

# Resources

[Queue Using Two Stack on Geeks for Geeks](http://www.geeksforgeeks.org/queue-using-stacks/)
