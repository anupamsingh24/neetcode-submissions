class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        int res = 0;
        int biggestOdd = 0;

        for(Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() % 2 == 0) {
                res += item.getValue();
            } else {
                biggestOdd = Math.max(biggestOdd, item.getValue());
            }
        }

        res +=biggestOdd;
        return res;
    }
}