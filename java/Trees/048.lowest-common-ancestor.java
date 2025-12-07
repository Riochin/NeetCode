package java.Trees;

// Lowest Common Ancestor in Binary Search Tree
// 🔗 https://neetcode.io/problems/lowest-common-ancestor-in-binary-search-tree/solution

// 問題文要約: 二つのp,qに共通する先祖をreturn
// 二つのノードを同時に走査？

// time complexity: O(N) 
// N is num of TreeNodes.

class Solution {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode findP = root;
        TreeNode findQ = root;
        TreeNode res = null;

        while((findP != null && findQ != null)){
            if(findP.val==p.val && findQ.val == q.val) break;
            System.out.println("checking" + findP.val + "," + findQ.val);

            if(findP.val == findQ.val) res = findP;

            if(findP.val < p.val) findP = findP.right;
            else if(findP.val > p.val) findP = findP.left; // 連続で進んでしまう可能性があるので、elifを用いる。
            if(findQ.val < q.val) findQ = findQ.right;
            else if(findQ.val > q.val) findQ = findQ.left;
        }
        
        return res;
    }
}
