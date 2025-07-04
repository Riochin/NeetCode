// time Complexity: O(N)
// space Complexity: O(N)

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // key: num , val: count
        HashMap<Integer, Integer> countMap = new HashMap<>();
        // array of List!!! 
        /* [1,2,3]
         * freqArr[1] -> List<1,2,3> */
        List<Integer>[] freqArr = new List[nums.length + 1];

        for(int i=0;i<freqArr.length; i++){
            freqArr[i] = new ArrayList<>();
        }

        for (int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            freqArr[entry.getValue()].add(entry.getKey()); 
        }

        int[] result = new int[k];
        int idx = 0; // result[idx] res[0,1,2,...,k-1] <- (idx < k)
        for(int i = freqArr.length - 1; i>0 && idx < k;i--){
            for(int n : freqArr[i]){
                result[idx++] = n;
                if(idx == k){
                    return result;
                }
            }
        }
        return result;
    }
}
