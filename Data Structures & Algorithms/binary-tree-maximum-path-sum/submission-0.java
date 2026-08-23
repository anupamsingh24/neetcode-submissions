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
    public int maxPathSum(TreeNode root) {

        if (root == null) return 0;

        int leftMax = maxPathSum(root.left);
        int rightMax = maxPathSum(root.right);

        int includeleftMax = root.val + leftMax;
        int includerightMax = root.val + rightMax;

        int excludeMax = Math.max(leftMax, rightMax);
        int tempMax = Math.max(includeleftMax, includerightMax);
        int finalMax = Math.max(excludeMax, tempMax);
        return Math.max(root.val + leftMax + rightMax, finalMax);
        
    }
}
