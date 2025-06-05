package java;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final int N = strs.length;
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String newStr = new String(charArr);

            if(map.containsKey(newStr)){
                map.get(newStr).add(s);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(newStr, list);
            }
        }

        Set<String> anagrams = map.keySet();
        List<List<String>> result = new ArrayList<>();

        for(String key: anagrams){
            result.add(map.get(key));
        }

        return result;
    }
}
