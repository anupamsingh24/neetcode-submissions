class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            result[i] = countOneInBinary(i);
        }

        return result;
        
    }

    private int countOneInBinary(int n) {
        if (n == 0) return 0;
        String binary = "";
        while (n > 0) {
            binary += Integer.toString(n % 2);
            n = n / 2;
        }

        int cnt = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') cnt++;
        }

        return cnt;


    }
}
