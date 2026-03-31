package java.Trees;

// Valid Binary Search Tree
// 🔗 https://neetcode.io/problems/valid-binary-search-tree/question

// Time Complexity: O(N)
// N is the number of nodes in the binary tree

class Solution {
    class TreeNode {
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

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
