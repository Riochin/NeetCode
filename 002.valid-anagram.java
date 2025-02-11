import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sa = s.split("");
        String[] ta = t.split("");

        Arrays.sort(sa);
        Arrays.sort(ta);// sort the arrays

        // for(int i=0;i<sa.length;i++){
        //     System.out.print(sa[i] + ",");
        // }
        // System.out.println();

        // for(int i=0;i<ta.length;i++){
        //     System.out.print(ta[i] + ",");
        // }
        // System.out.println();

        if(ta.length != sa.length){
            return false;
        }

        for(int i=0;i<sa.length;i++){
            System.out.println(i);
            if(! sa[i].contains(ta[i])){
                return false;
            }
        }
        return true;
    }
}
