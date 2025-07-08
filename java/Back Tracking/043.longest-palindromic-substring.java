// Longest Palindromic Substring
// Medium
// 🔗https://neetcode.io/problems/longest-palindromic-substring?list=neetcode250

// Time complexity: O(N^2)
// Space complexity: O(N): Space for output String

// s contains digit and English letters. -> 62

/* Test Case 1
* input: s = "aba"
* output: "aba"
*/

/* Test Case 2
* input: s = "aaba"
* output: "aba"
*/

/* Test Case 3
* input: s = "caaab"
* output: "aaa"
*/

/* Test Case 4
* input: s = ""
* output: ""
*/

/* Test Case 5
* input: s = "a"
* output: "a"
*/

/* ⚠️ Test Case 6
* input: s = "aa"
* output: "aa"
*/

/* ⚠️ Test Case 7
* input: s = "aab"
* output: "aa"
*/

class Solution {
    public String longestPalindrome(String s) { // s = "a"
        if (s.equals("")) return "";
        char[] charArr = s.toCharArray(); // charArr = [a,a,b,a] 

        int R = 0, L = 0; // R = 0  , L = 0

        for(int i=0;i<charArr.length;i++){
            int l = i, r = i; // i = 1, l = 0, r = 2, charArr[i] = 
            
            while(l >= 0 && r < charArr.length && charArr[l] == charArr[r]){
                // System.out.println(charArr[l] + ", " + charArr[r]);
                if(r - l > R - L){
                    R = r;
                    L = l;
                }

                l --;
                r ++;
            }
            
            l = i; r = i + 1;

            while(l >= 0 && r < charArr.length && charArr[l] == charArr[r]){
                if(r - l > R - L){
                    R = r;
                    L = l;
                }

                l --;
                r ++;
            }
        }

        String res = ""; // res = "aba"
        for(int i=L; i<=R; i++){
            res += charArr[i];
        }

        return res;
    }
}
