package java;

// Time complexity: O(n)
// Space complexity: O(n)

// 1. insert tokens into the STACK.👇
// 2. if [+, *, -, /] appear, pop stored nums from stack & compute it.
// 3. computed -(push)-> stack

import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            switch (token){
                case "+":
                    // +の処理
                    int a1 = stack.pop();
                    int b1 = stack.pop();
                    stack.push(a1 + b1);
                    break;
                case "-":
                    // -の処理
                    int a2 = stack.pop();
                    int b2 = stack.pop();
                    stack.push(b2 - a2);
                    break;
                case "/":
                    // /の処理
                    int a3 = stack.pop();
                    int b3 = stack.pop();
                    stack.push(b3 / a3);
                    break;
                case "*":
                    // *の処理
                    int a4 = stack.pop();
                    int b4 = stack.pop();
                    stack.push(a4 * b4);
                    break;
                default: 
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}
