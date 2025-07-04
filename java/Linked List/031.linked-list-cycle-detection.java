// Time complexity: O(N)
// Space complexity: O(N)

// ⚠️ 同じ値があるリストだと、動かない可能性あり
// 💡 HashMap<ListNode, Integer > にする
// 💡 ついでに、HashSetで`.contains`の重複チェックだけで良い。

 import java.util.*;

 class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next=next;}
    }

    public boolean hasCycle(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>(); // <Integer num, Integer count>
        
        while(head != null){
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            if(map.get(head.val) == 2){
                return true;
            }
            head  = head.next;
        }
        return false;
    }
}
