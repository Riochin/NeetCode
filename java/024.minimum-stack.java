package java;

// Time complexity: O(1);
// Space complexity: O(n);

/*
* One Stack + variable min
* input[5,2,3,2,1]
* Stack : [0,-3,1,0,-1]
* min: 5 -> 2 -> 1
*/

import java.util.*;

class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()){
            stack.push(0L);
            min = val;
        } else {
            stack.push(val - min);
            if(min > val){
                min = val;
            }
        }
    }
    
    public void pop() {
        long pop = stack.pop();
        if (pop < 0){
            min -= pop;
        }
    }
    
    public int top() {
        long peek = stack.peek();
        if (peek > 0){
            return (int)(peek + min);
        } else {
            return (int)(min);
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
