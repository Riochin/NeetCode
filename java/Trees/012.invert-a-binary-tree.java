package java.Trees;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode result = new TreeNode(root.val);
        TreeNode dummy = result;
        result.right = invertTree(root.left);
        result.left = invertTree(root.right);

        return dummy;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }
}
