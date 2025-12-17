// Kth Largest Element in a Stream
// 🔗 https://neetcode.io/problems/kth-largest-integer-in-a-stream/

// Time complexity: O(m * logk)
// Space Complexity: O(k)

import java.util.*;

class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k){ // [1,[]] に後から加えられるようなケースもある
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

