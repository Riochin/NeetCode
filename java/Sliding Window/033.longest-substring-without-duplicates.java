/*
* 問題文（私的日本語訳）
* 文字列sが与えられます。同じ文字列部分を取り除いたときの、最長の長さを返してください。
*/

/*
* 解法1 Time: O(N^2), Space: O(N)
* Charを保存するキューを作成し、同じ文字を見たら取り出して確認する
* -> めっちゃかかる... s.length <= 1000だからギリギリ実行できるか...?
*/

/*
* 解法2 O(N), O(M)
* - キューではなくHashSetを使うことで、重複の確認にかかる時間をO(1)にできる。
* - HashSetの大きさはユニークな文字数に比例
*
*/

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) { 
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for(int r = 0; r < s.length(); r++){
            while (charSet.contains(s.charAt(r))){ // その文字に辿り着くまで全部消す pwwkew の時、wを見つけた瞬間w消すだけじゃpが残る
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        } 
        return res;
    }
}

//s="abcdfwghijklmenopwqrsteuvxlyzcalbdofghcijkonpqmerumvtwxyzoesabcdfghtijoklmnsqtruvwxeyzpabcdefghipjkl"
// ☝️ STEP Class1のやつ...