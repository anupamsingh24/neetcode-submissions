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

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode prev = root;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null && prev != null) {
                result.add(prev.val);
                q.add(null);
            } else if (node != null){
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            prev = node;
        }

        return result;
    }
}
