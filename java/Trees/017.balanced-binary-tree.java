package java.Trees;

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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        } if(isBalanced(root.left)== false || isBalanced(root.right)==false){
            return false;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        System.out.println(root.val+","+left+","+right);
        return Math.abs(left - right) <= 1;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left, right)+1;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}

//         1
//        / \
//       2   3
//      / \   \
//     4   5   6
//    /         \
//   7           8
