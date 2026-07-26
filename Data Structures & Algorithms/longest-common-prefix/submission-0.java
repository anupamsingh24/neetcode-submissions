class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = "";
        for(int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[strs.length -1].charAt(i)) {
                prefix += strs[0].charAt(i);
            } else break;
        }
        return prefix;
        
    }
}