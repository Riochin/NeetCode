package java;

// Time complexity: O(N)
// Space complexity: O(N)

// 左右どちらにもp, qがある場合は進みたくない
// 左右片方にしかp, qが集中していない場合は進む

class Solution {
    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null){
            return null;
        }

        if(Math.max(p.val, q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        } else if (Math.min(p.val, q.val) > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
