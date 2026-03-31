// Products of Array Discluding Self
// 🔗 https://neetcode.io/problems/products-of-array-discluding-self/question

// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // 左側の積（prefix）を res に入れる
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        // 右側の積（suffix）を掛け合わせる
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
