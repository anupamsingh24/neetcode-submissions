class Solution {
    public int maxScore(String s) {
        int score = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++) {
            int scoreZero = getZeroScore(s, i);
            for (int j = i + 1; j < s.length(); j++) {
                int scoreOne = getOneScore(s, j);
                score = Math.max(score, scoreZero + scoreOne);
            }
        }

        return score;
    }

    private int getZeroScore(String s, int index) {
        int count = 0;

        for (int i = 0; i <= index; i++) {
            if (s.charAt(i) == '0') count++;
        }

        return count;
    }

    private int getOneScore(String s, int index) {
        int count = 0;
        for(int i = index; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}