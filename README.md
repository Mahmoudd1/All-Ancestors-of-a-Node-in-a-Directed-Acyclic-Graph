# All-Ancestors-of-a-Node-in-a-Directed-Acyclic-Graph

## Problem Description

Given a directed acyclic graph (DAG) represented by the number of nodes n and an array of directed edges edges, where edges[i] = [a, b] means there is a directed edge from node a to node b. The task is to find all ancestors of each node in the graph.

## Solution Approach

The solution utilizes Depth-First Search (DFS) to traverse the directed acyclic graph and find the ancestors of each node. 
It creates an adjacency list to represent the graph with reversed edges, enabling the algorithm to find ancestors instead of descendants.
For each node in the graph, it performs a DFS to find all ancestors by traversing the reversed edges. 
The result is a list of lists, where each sublist contains the ancestors of a specific node.

## Pseudocode
```
Initialize a HashMap to represent the adjacency list of the graph
For each directed edge [a, b] in the edges array:
    Add a to the adjacency list of b (reverse the direction)

Initialize an empty list of lists to store the result
For each node in the graph:
    Initialize a boolean array to keep track of visited nodes
    Initialize an empty list to store ancestors of the current node
    Perform DFS starting from the current node, adding ancestors to the list
    Sort the list of ancestors
    Add the sorted list to the result

Return the result
```
## Time Complexity

The time complexity of this solution is O(V + E), where V is the number of nodes and E is the number of edges in the reversed directed acyclic graph. This is because the DFS traversal visits each node and each edge once.

## Space Complexity

The space complexity is O(V), where V is the number of nodes. This is due to the space required for the adjacency list and the boolean array to track visited nodes during DFS.
