// Two Sum 
// 🔗https://neetcode.io/problems/two-integer-sum?list=neetcode150

// Time complexity: O(N)
// Space complexity: O(N)

/*
 * 数 -> インデックス のHashMapを作成し、target - nums[i]に対して値を取得し答えを求める！
 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicts = new HashMap<>();
        int N = nums.length;
        
        for(int i=0;i<N;i++){
            indicts.put(nums[i], i); // その数は、i番目にありますよー
        }

        for(int i=0;i<N;i++){
            int dif = target - nums[i];
            if(indicts.containsKey(dif) && indicts.get(dif) != i){
                int j = indicts.get(dif);
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
