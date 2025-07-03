package java;

/*
* 1. binary search in leftest column. (logm) （targetより小さい最大の値を探す）
* 2. binary search in row. (logn)
* 3. found or not found
* -> time complexity: log(m) + log(n) = log(m*n)!!!
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] leftRows = new int[matrix.length];

        for(int i=0; i<matrix.length; i++){
            leftRows[i] = matrix[i][0];
        }

        // System.out.println(Arrays.toString(leftRows));

        int rowIdx = searchRow(leftRows, target, 0, leftRows.length-1);
        if(rowIdx == -1) return false;
        // System.out.println(rowIdx);

        int[] targetRow = matrix[rowIdx];
        int res = binarySearch(targetRow, target, 0, targetRow.length-1);

        return (res >= 0);
    }

    public int searchRow(int[] nums, int target, int l, int r){
        if (r < l || r >= nums.length){
            return -1;
        }

        int m = (l+r) / 2;

        if (nums[m] <= target){
            if (nums.length-1 >= m+1){
                if(nums[m+1] > target){
                    return m;
                } 
            }  else {
                return m;
            }
        } 
        
        if (target < nums[m]){
            r = m - 1;
        } else if (nums[m] < target){
            l = m + 1 ;
        }

        return searchRow(nums, target, l, r);
    }

    public int binarySearch(int[] nums, int target, int l, int r){
        if (r < l || r >= nums.length){
            return -1;
        }

        int m = (l+r) / 2;

        if (nums[m] == target){
            return m;
        } else if (target < nums[m]){
            r = m - 1;
        } else if (nums[m] < target){
            l = m + 1;
        }

        return binarySearch(nums, target, l, r);
    }
}
