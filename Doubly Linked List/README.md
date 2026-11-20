# Doubly Linked List (DLL)

A **Doubly Linked List** is a linear data structure in which each node contains three parts:
- **Data** – stores the value.
- **Previous pointer (`prev`)** – points to the previous node.
- **Next pointer (`next`)** – points to the next node.

Unlike a singly linked list, a doubly linked list allows traversal in both forward and backward directions.

## Structure of a Node

Each node contains:
- `prev` – reference to the previous node.
- `data` – value stored in the node.
- `next` – reference to the next node.

`NULL` is stored in the `prev` of the first node and the `next` of the last node.

## Operations on Doubly Linked List

### 1. Traversal
- Traverse the list from head to tail using the `next` pointer.
- Traverse the list from tail to head using the `prev` pointer.

### 2. Insertion
- Insert a node at the beginning.
- Insert a node at the end.
- Insert a node at a given position.
- Insert a node before or after a given node.

### 3. Deletion
- Delete the first node.
- Delete the last node.
- Delete a node at a given position.
- Delete a node with a given value.

### 4. Reverse a Doubly Linked List
Swap the `prev` and `next` pointers of every node and update the head to the last node.

## Advantages
- Supports traversal in both directions.
- Insertion and deletion are easier when the node reference is available.
- Useful in implementing deques, browser navigation and undo/redo operations.

## Disadvantages
- Requires extra memory to store the `prev` pointer.
- Pointer manipulation is more complex than in a singly linked list.

## Time Complexity

| Operation | Time Complexity |
|---|---|
| Traversal | O(n) |
| Search | O(n) |
| Insertion at beginning | O(1) |
| Insertion at end (with tail) | O(1) |
| Deletion at beginning | O(1) |
| Deletion at end (with tail) | O(1) |
| Reversal | O(n) |

## Applications
- Browser forward and backward navigation.
- Undo and redo functionality.
- Implementing Deques.
- Music playlists.
- LRU Cache implementation.

---
**Language:** Java
