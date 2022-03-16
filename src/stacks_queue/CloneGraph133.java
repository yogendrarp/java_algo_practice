package stacks_queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph133 {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();

        return clone(node, map);
    }

    Node clone(Node node, HashMap<Node, Node> map) {
        if (map.containsKey(node)) return map.get(node);

        Node newNode = new Node(node.val);

        map.put(node, newNode);

        for (Node neigh : node.neighbors) {
            newNode.neighbors.add(clone(neigh, map));
        }

        return newNode;
    }

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
}
