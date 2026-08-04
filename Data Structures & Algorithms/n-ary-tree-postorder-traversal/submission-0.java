/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postOrderTrav(root, list);
        return list;
    }

    private void postOrderTrav(Node root, List<Integer> value) {
        if (root == null) return;

        for (Node child : root.children) {
            postOrderTrav(child, value);
        }

        value.add(root.val);
    }
}