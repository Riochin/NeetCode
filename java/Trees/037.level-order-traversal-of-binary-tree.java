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

// Time complexity: O(N)
// Space complexity: O(N)

/*
* root, level(=階層)を引数にもつ関数を作成し、treeを探索してもらう。
* - valueをListのlevel番目に追加（level番目がないなら、level番目のリストを追加）
* - 左先で再起呼び出し。
* - nullが出たら、return
*/

import java.util.*;

class Solution {
    class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(){}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        searchTree(root, 0, ans);

        return ans;
    }

    public void searchTree(TreeNode root, int level, List<List<Integer>> list){
        if(root == null) return;

        // listにlevel番目がない場合は追加
        if(list.size() == level) list.add(new ArrayList<Integer>());
        // listのlevel番目のリストにroot.valを追加する
        list.get(level).add(root.val);

        searchTree(root.left, level+1, list);
        searchTree(root.right, level+1, list);

    }
}
