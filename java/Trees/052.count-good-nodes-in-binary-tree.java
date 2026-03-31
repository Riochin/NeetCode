package java.Trees;

// Count Good Nodes in Binary Tree
// 🔗 https://neetcode.io/problems/count-good-nodes-in-binary-tree/

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

    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, Integer.MIN_VALUE);
    }

    public int findGoodNodes(TreeNode root, int max) {
        if (root == null) return 0;
        
        int count = 0;
        if (max <= root.val) {
            count = 1;
            max = root.val;
        }
        
        return count + findGoodNodes(root.left, max) + findGoodNodes(root.right, max);
    }
}
