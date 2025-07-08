// Longest Substring Without Repeating Characters
// 🔗https://neetcode.io/problems/longest-substring-without-duplicates?list=neetcode250

// Time complexity: O(N)
// Space complexity: O(N)

/* Testcase 1
* input: s = "abcabcabc"
* output: 3
*/

/* Testcase 2
* input: s = "aaaa"
* output: 1
*/

/* Testcase 3
* input: s = "cbab"
* output: 3
*/

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> charSet = new HashSet<>();
       // < a
       char[] charArr = s.toCharArray();
       // [a,a,a,a,a,a]

       int l = 0; // 0
       int ans = 0;

        for(char c : charArr){ // c=a
            while(charSet.contains(c)){
                charSet.remove(charArr[l]);
                // charSetはこれまでのループ回数分しか足されないので、lが配列外参照する危険はない。
                l++; 
            }
            charSet.add(c);
            ans = Math.max(charSet.size(), ans);
        }
        return ans;
    }
}