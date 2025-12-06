package java.Trees;

// 199. Binary Tree Right Side View
// 🔗 https://neetcode.io/problems/binary-tree-right-side-view/question



// RETURN ALL NODE.val CAN BE SAW FROM Tree's "RIGHT SIDE"!!

// time complexity: O(N) 
// N is the num of treenodes.

import java.util.*;

class Solution {
    // Definition for a binary tree node.
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int qLen = q.size();
            TreeNode rightView = null;

            for(int i=0;i<qLen;i++){
                TreeNode node = q.poll();
                // System.out.println(node.val + "is checked");

                if(node == null) continue;
                rightView = node;
                
                q.offer(node.left);
                q.offer(node.right);
            }
            if(rightView != null)res.add(rightView.val);
        }
        return res;
    }
}