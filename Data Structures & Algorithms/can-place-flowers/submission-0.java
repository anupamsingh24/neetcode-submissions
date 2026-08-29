class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int val : flowerbed) {
            if (val == 0) cnt++;
        }
        
        if (cnt / 3 >= n) return true;
        else return false;
    }
}