// Subsets
// 🔗https://neetcode.io/problems/subsets?list=neetcode150

// Time complexity: O(2^n)
// Space complexity: O(n): subset size, O(2^n): for the output list.

/*
 * <DFSで頑張ろう作戦>
 * 再起的なDFSで 入れる or 入れない を求めていく！
 */

/*
 * 追加順: [[1,2,3],[1,2],[1],[2,3],[2],[3],[]]
 */


import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, subset, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<Integer> subset, List<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums, i+1, subset, res);
        subset.remove(subset.size() -1);
        dfs(nums, i+1, subset, res);
    }
}
