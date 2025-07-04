package java.Trees;

 class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q!= null) || (p != null && q == null)){
            return false;
        } else if(p == null && q == null){
            return true;
        }

        boolean isSameVal = p.val == q.val;

        return isSameVal && (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}
