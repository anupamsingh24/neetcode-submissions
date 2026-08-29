class Solution {
    public int[] plusOne(int[] digits) {
        int val = 0;
        int pow = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            val += digits[i] * Math.pow(10, pow);
            pow++;
        }
        
        val += 1;

        ArrayList<Integer> list = new ArrayList<>();
        while(val > 0) {
            list.add(val % 10);
            val = val / 10;
        }

        int[] res = new int[list.size()];
        int j = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            res[j++] = list.get(i);
        }
        return res;
    }
}
