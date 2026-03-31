class Solution {
    public boolean isValidBST(TreeNode root) {
        // 初期状態ではどんな値でも OK なので、範囲は -∞〜+∞ にしておく
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) {
        if (node == null) return true;

        // 自分自身が (min, max) の範囲に入っているか
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // 左の子は「max が自分の val」に制限される
        // 右の子は「min が自分の val」に制限される
        return helper(node.left, min, node.val)
            && helper(node.right, node.val, max);
    }
}
