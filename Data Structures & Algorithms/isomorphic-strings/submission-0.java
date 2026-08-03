class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            if (!sMap.containsKey(ch)) {
                sMap.put(ch, 1);
            } else {
                sMap.put(ch, sMap.get(ch) + 1);
            }
        }

        for (Character ch : t.toCharArray()) {
            if (!tMap.containsKey(ch)) {
                tMap.put(ch, 1);
            } else {
                tMap.put(ch, tMap.get(ch) + 1);
            }
        }

        if (sMap.size() == tMap.size()) return true;

        return false;


        
    }
}