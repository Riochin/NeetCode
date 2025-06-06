package java;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String newStr = String.valueOf(charArr);

            if(map.containsKey(newStr)){
                map.get(newStr).add(s);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(newStr, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
