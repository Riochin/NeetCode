package java;

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
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        int leftCnt = maxDepth(root.left);
        int rightCnt = maxDepth(root.right);

        return Math.max(leftCnt, rightCnt) +1;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

    }
}
