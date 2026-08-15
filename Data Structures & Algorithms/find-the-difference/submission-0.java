class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.charAt(0);

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sSorted = new String(sArray);
        String tSorted = new String(tArray);

        for (int i = 0; i < sSorted.length(); i++) {
            if (sSorted.charAt(i) != tSorted.charAt(i)) return tSorted.charAt(i);
        }

        return tSorted.charAt(tSorted.length() - 1);
        
    }
}