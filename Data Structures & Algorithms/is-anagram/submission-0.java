class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        System.out.println(sArr);
        System.out.println(tArr);
        String sSort = String.valueOf(sArr);
        String tSort = String.valueOf(tArr);

        if (sSort.equals(tSort)) return true;
        return false;

    }
}
