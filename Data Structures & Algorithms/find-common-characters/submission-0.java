class Solution {
    public List<String> commonChars(String[] words) {

        Map<String, int[]> map = new HashMap<>();

        for (String word : words) {
            int[] freq = new int[26];
            Arrays.fill(freq, 0);
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
            map.put(word, freq);
        }

        List<String> result = new ArrayList<>();
        int[] resFreq = new int[26];
        Arrays.fill(resFreq, Integer.MAX_VALUE);

        for (int i = 0; i < 26; i++) {
            for (Map.Entry<String, int[]> item : map.entrySet()) {
                resFreq[i] = Math.min(resFreq[i], item.getValue()[i]);
            }
        }
        for (int i = 0 ; i < 26; i++) {
            for (int j = 0; j < resFreq[i]; j++) {
                result.add(String.valueOf((char)('a' + i)));
            }
        }
        return result;
    }
}