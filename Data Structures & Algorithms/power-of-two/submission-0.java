class Solution {
    public boolean isPowerOfTwo(int n) {
        String binary = decimalToBinary(n);
        int cnt = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') cnt++;
            if (cnt > 1) return false;
        }

        if (cnt == 1) return true;
        return false;
        
    }

    public static String decimalToBinary(int n)
    {
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum
                = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }
}