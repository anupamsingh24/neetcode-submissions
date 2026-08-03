class Solution {
    public String mergeAlternately(String word1, String word2) {

        int left = 0, right = 0;
        String res = "";

        while (left < word1.length() && right < word2.length()) {
            res += word1.charAt(left++);
            res += word2.charAt(right++);

        }

        while (left < word1.length()) {
            res += word1.charAt(left++);
        }

        while (right < word2.length()) {
            res += word2.charAt(right++);
        }

        return res;
        
    }
}