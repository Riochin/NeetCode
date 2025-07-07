// Subsets
// 🔗https://neetcode.io/problems/subsets?list=neetcode150


//Iteration

// Time complexity: O(2^n)
// Space complexity: O(n): subset size, O(2^n): for the output list.

// testcase1: [1,2,3]
// res= [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// subset= [1,2,3]
// num = 3
// size = 4

// testcase2: [1]
// res = [[],[1]]

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<Integer>());

        for(int num: nums){
            int size = res.size();
            for(int i=0;i<size;i++){
                List<Integer> subSet = new ArrayList<>(res.get(i));
                subSet.add(num);
                res.add(subSet);
            }
        }

        return res;
    }
}
