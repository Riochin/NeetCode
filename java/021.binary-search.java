package java;

class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        return binarySearch(nums, target, r, l);
    }
    public int binarySearch(int[] nums, int target, int r, int l){
        int mid = (r + l)/2;
        
        if(r < l){
            return -1;
        }

        if(nums[mid] == target){
            return mid;
        } else if(target > nums[mid]){
            l = mid+1;
        } else {
            r = mid-1;
        }

        return binarySearch(nums, target, r, l);
    }
}
