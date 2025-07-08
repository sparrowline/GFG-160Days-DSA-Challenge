# DFS of Graph

---

## Problem Statement

Given a connected undirected graph with `V` vertices represented as an adjacency list `adj[][]`, perform a **Depth First Search (DFS)** starting from vertex `0`.  
The graph should be traversed from **left to right** according to the order of the adjacency list.

---

## Examples

### Example 1

**Input:**  
`adj = [[2, 3, 1], [0], [0, 4], [0], [2]]`  
**Output:**  
`[0, 2, 4, 3, 1]`  
**Explanation:**  
- Start at vertex 0 → `0`
- Visit 2 → `0, 2`
- Visit 4 → `0, 2, 4`
- Backtrack to 2, then to 0
- Visit 3 → `0, 2, 4, 3`
- Visit 1 → `0, 2, 4, 3, 1`

---

### Example 2

**Input:**  
`adj = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]`  
**Output:**  
`[0, 1, 2, 3, 4]`  
**Explanation:**  
- Start at vertex 0 → `0`
- Visit 1 → `0, 1`
- Visit 2 → `0, 1, 2`
- Visit 3 → `0, 1, 2, 3`
- Visit 4 → `0, 1, 2, 3, 4`

---

## Constraints

- `1 ≤ V ≤ 10⁴`
- `1 ≤ adj[i][j] ≤ 10⁴`

---

## Approach

Use **Depth First Search (DFS)** algorithm to traverse the graph from the starting vertex `0`.

### Steps:
1. Initialize a visited array of size `V`.
2. Create a result list to store the DFS traversal.
3. Write a recursive helper function to perform DFS.
4. Start DFS from vertex `0`.

---

## Java Implementation

```java
import java.util.*;

public class GraphDFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfs(0, adj, visited, result);
        return result;
    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(0);
        adj.get(4).add(2);

        GraphDFS g = new GraphDFS();
        System.out.println(g.dfsOfGraph(V, adj)); // Output: [0, 2, 4, 3, 1]
    }
}