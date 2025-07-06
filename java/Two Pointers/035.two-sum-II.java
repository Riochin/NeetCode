// Time complexity: O(N)  N is numbers.length
// Space complexity: O(1)

/*
 * i = 0, j = nums.length-1
 * sum = nums[i] + nums[j] に応じてi,jの値を変える: 
 * - sum < target のとき、 i++
 * - sum > target のとき、 j--
 * するとびっくり、二つのポインタで良い感じにsum == target が見つかるぞ！
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;

        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
            } else if(sum > target) {
                j--;
            } else {
                return new int[] {i+1, j+1};
            }
        }
        
        return new int[0];
    }
}
