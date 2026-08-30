/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BSTIterator {
    private List<Integer> arr;
    private int itr;

    public BSTIterator(TreeNode root) {
        arr = new ArrayList<>();
        itr = 0;
        dfs(root);
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        arr.add(node.val);
        dfs(node.right);
    }

    public int next() {
        return arr.get(itr++);
    }

    public boolean hasNext() {
        return itr < arr.size();
    }
}