class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!mapA.containsKey(ransomNote.charAt(i))) {
                mapA.put(ransomNote.charAt(i), 1);
            } else {
                mapA.put(ransomNote.charAt(i), mapA.get(ransomNote.charAt(i)) + 1);
            }
        }


        for (int i = 0; i < magazine.length(); i++) {
            if (!mapB.containsKey(magazine.charAt(i))) {
                mapB.put(magazine.charAt(i), 1);
            } else {
                mapB.put(magazine.charAt(i), mapB.get(magazine.charAt(i)) + 1);
            }
        }


        for (Map.Entry<Character, Integer> item : mapA.entrySet()) {
            if (item.getValue() > mapB.getOrDefault(item.getKey(), 0)) return false;
        }

        return true;
    }
}