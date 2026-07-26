class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String anagram = String.valueOf(strArr);
            if (!map.containsKey(anagram)) {
                map.put(anagram, new ArrayList<String>());
                List<String> val = map.get(anagram);
                val.add(str);
                map.put(anagram, val);

            } else {
                List<String> val = map.get(anagram);
                val.add(str);
                map.put(anagram, val);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
