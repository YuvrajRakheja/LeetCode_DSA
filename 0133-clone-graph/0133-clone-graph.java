/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/**
 * DFS - Recursive
 *
 * Time Complexity: O(V + E)
 *
 * Space Complexity: O(V). Both Recursion Stack and HashMap will take O(V) space
 *
 * V = Number of nodes. E = Number of edges in the graph.
 */
class Solution{
    public Node cloneGraph(Node node) {
        return cloneGraphDFSHelper(node, new HashMap<>());
    }

    private Node cloneGraphDFSHelper(Node cur, HashMap<Node, Node> visited) {
        if (cur == null) {
            return null;
        }
        if (visited.containsKey(cur)) {
            return visited.get(cur);
        }

        Node newNode = new Node(cur.val);
        visited.put(cur, newNode);

        for (Node n : cur.neighbors) {
            newNode.neighbors.add(cloneGraphDFSHelper(n, visited));
        }

        return newNode;
    }
}
