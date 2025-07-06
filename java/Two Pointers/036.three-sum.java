// Three sum 🔗https://neetcode.io/problems/three-integer-sum?list=neetcode150

/*
* [-1,1,0,2,-1] -> [[-1,1,0],[-1,-1,2]]
* [0,0,0] -> [0,0,0]
* [0,1,1] -> []
*/

// Time complexity: O(N^2)
// Space complexity: sort:O(1) or O(N), output: O(m)
// m is number of triplets
// n is length of the given array

/*
* 先にiだけ決めてから、Two Sum の要領でl,rも決める！
* 注: nums[i] == nums[i-1] だと、以前と同じ組み合わせになるため、ずらす
*/

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue; // 同じ数字をとっているからずらす

            int l = i + 1, r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                } else if (sum < 0){
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
