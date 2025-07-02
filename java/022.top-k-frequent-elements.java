package java;

// time Complexity: O(NlogN)
// space Complexity: O(N)

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>(); // 出現回数を記録するhashmap
        for (int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> countArr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            countArr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        countArr.sort((a,b) -> b[0] - a[0]); // sort O(NlogN)
        // <value: appearance count, key: number>

        int[] results = new int[k];
        for(int i=0; i<k;i++){
            // 出現回数上位kこの中身を取り出す
            results[i] = countArr.get(i)[1];
        }

        return results;
    }
}
