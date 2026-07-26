class Solution {
    public boolean isPalindrome(String s) {
        String sLower = s.toLowerCase();
        String sFormat = "";
        for (char c : sLower.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sFormat += c;
            }
        }

        int left = 0, right = sFormat.length() - 1;
        while (left < right) {
            if (sFormat.charAt(left) != sFormat.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
        
    }
}
