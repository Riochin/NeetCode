package java.Trees;

// Binary Tree Level Order Traversal
// 🔗https://neetcode.io/problems/level-order-traversal-of-binary-tree?list=blind75

/*
* <BFSで求める作戦>
* 現在のノードの左右をキューに追加していき、BFS的にその中身を訪問し、level（リスト）に保存。
* levelリストの中身を階層ごとにまとめてansに追加
*/

// Time complexity: O(N)
// Space complexity: O(N)

import java.util.*;

class Solution {
    class TreeNode{
        int val;
        TreeNode right, left;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);        
        
        // queueに追加していきBFS!
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();

            for(int i=queue.size(); i>0 ; i--){ // for開始前のqueueのサイズ分だけループする
                TreeNode node = queue.poll();
                if(node == null) continue;

                level.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            
            if(level.size() > 0){
                 ans.add(level);
            }
        }

        return ans;
    }
}
