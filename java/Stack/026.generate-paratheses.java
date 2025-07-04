package java.Stack;

/* 
* - only add open paranthesis if open < n
* - only add a closing paranthesis if closed < open
* - valid : open == closed == n
*/

/* Test Case...
* n = 2
* open = 0
* close = 0
*/

import java.util.*;

class Solution {
    public void backTracking(int n, int openN, int closeN, StringBuilder stack, List<String> res){
        if (openN == closeN && openN == n){
            res.add(stack.toString());
            return;
        }

        if (openN < n){
            stack.append("(");
            backTracking(n, openN + 1, closeN, stack, res);
            stack.deleteCharAt(stack.length() -1 );
        }

        if (openN > closeN){
            stack.append(")");
            backTracking(n, openN, closeN + 1, stack, res);
            stack.deleteCharAt(stack.length() -1 );
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backTracking(n, 0, 0, stack, res);
        return res;
    }
}
