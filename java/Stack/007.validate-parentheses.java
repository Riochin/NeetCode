package java.Stack;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        Deque<String> stack = new ArrayDeque<String>();

        for(char c: s.toCharArray()){
            String ch = String.valueOf(c);
            if (map.containsKey(ch)){
                // System.out.println(ch);
                if(!stack.isEmpty() && stack.peek().equals(map.get(ch))){
                    // System.out.println(ch);
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(String.valueOf(ch));
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
